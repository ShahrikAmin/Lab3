import java.util.*;

public class AddressBook {
    
    // Text to file added outside of intellj

    ArrayList<BuddyInfo> BuddyInfos = new ArrayList<BuddyInfo>(); // change to buddyInfo

    // check these two methods
    public void addBuddy(BuddyInfo obj){
        BuddyInfos.add(obj);
    }
    public void removeBuddy(BuddyInfo obj){
        BuddyInfos.remove(obj);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
