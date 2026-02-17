import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class BuildingTest {

    @Test
    void setOwnerTest(){
        Building b1=new Building();
        b1.setOwner("test");
        assertEquals("test",b1.getOwner());
    }

    @Test
    void setAddressTest() {
        Building b1 = new Building();
        b1.setAddress("test");
        assertEquals("test",b1.getAddress());
    }

    @Test
    void createTest() {
        Building b1 = new Building("Mahesh","123 High Street");
        assertEquals("Mahesh",b1.getOwner());
        assertEquals("123 High Street",b1.getAddress());
    }

    @Test
    void getNumberOfBuildingTest(){
        Building b1 = new Building();
        assertEquals(1, Building.getNumOfBuildings());
        Building b2 = new Building("jhon", "111 Maple");
        assertEquals(2, Building.getNumOfBuildings());
    }
}