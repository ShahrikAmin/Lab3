import java.util.HashMap;

public class AddressBook {

    HashMap<Integer, BuddyInfo> objectCollection = new HashMap<>();

    // check these two methods
    public void addBuddy(int collectionPlace,BuddyInfo obj){
        objectCollection.put(collectionPlace, obj);
    }
    public void removeBuddy(int collectionPlace, BuddyInfo obj){
        objectCollection.remove(collectionPlace, obj);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
