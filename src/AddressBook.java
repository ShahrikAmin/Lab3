import java.util.*;

public class AddressBook {

    ArrayList<BuddyInfo> objectCollections = new ArrayList<BuddyInfo>();

    // check these two methods
    public void addBuddy(BuddyInfo obj){
        objectCollections.add(obj);
    }
    public void removeBuddy(BuddyInfo obj){
        objectCollections.remove(obj);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
