public class Building {
    private String owner;
    private String address;
    private static int numOfBuildings = 0;

    public Building(){
        this.owner = "";
        this.address = "";
        numOfBuildings++;
    }

    public Building(String owner, String address){
        this.owner = owner;
        this.address = address;
        numOfBuildings++;
    }

    public static int getNumOfBuildings() {
        return numOfBuildings;
    }

    public String getOwner(){
        return owner;
    }

    public String getAddress(){
        return address;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Building{" +
                "owner='" + owner + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Building b1 = new Building();
        b1.setOwner("Mahesh");
        b1.setAddress("123 Main St");
        System.out.println(b1);
        Building b2 = new Building("David", "234 High St");
        System.out.println(b2);
        System.out.println("Number of Buildings:"+Building.getNumOfBuildings());

    }

}
