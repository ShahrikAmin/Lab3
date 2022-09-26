public class BuddyInfo {


    private String name;
    private String address;
    private String phoneNumber;

    // Default Constructor
    public BuddyInfo() {
        this.name = "Default";
    }

    // Parameter Constructor
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        BuddyInfo obj1 = new BuddyInfo("Homer", "Carleton", "613");
        String name = obj1.getName();
        System.out.println("Hello " + name);
    }

}
