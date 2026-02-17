public class Main {
    public static void main(String[] args) {
        Building b1 = new Building("Mahesh", "111 High Street");
        House h1 = new House("Anish", "222 Main Street",5,true);
        System.out.println(b1);
        System.out.println(h1);
        System.out.println("Number of Buildings:"+Building.getNumOfBuildings());
        System.out.println("Number of Houses:"+House.getNumOfHouses());
    }
}
