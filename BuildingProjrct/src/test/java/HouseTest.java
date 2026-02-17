import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void getNumOfHousesTest() {
        House h1 = new House("Chettri", "116 Main Place",2,false);
        assertEquals(1, h1.getNumOfHouses());
    }

    @Test
    void setNumOfRooms() {
        House h1 = new House("ali", "225 springbank Road", 6, false);
        h1.setNumOfRooms(3);
        assertEquals(3,h1.getNumOfRooms());
    }

    @Test
    void setHasGarage() {
        House h1 = new House("ali", "225 springbank Road", 6, false);
        h1.setHasGarage(true);
        assertTrue(h1.isHasGarage());
    }

    @Test
    void createTest() {
        House h1 = new House("ali", "225 springbank Road", 6, false);

    }
}