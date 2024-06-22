package arrays_vs_array_list;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        // Has to specify size, can not be changed once its created
        String[] friendsArray = {"John", "Jane", "Jim", "Jill"};

       
        // Does not have to specify size
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("John", "Jane", "Jim", "Jill"));


        // Things to do
        // Get an element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));

        // get size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        // Add an element
        // Cant do that with arrays :(
        friendsArrayList.add("Joe");
        System.out.println(friendsArrayList.get(4));

        // Set an element
        friendsArray[0] = "Carl";   
        System.out.println(friendsArray[0]);
        friendsArrayList.set(0, "Carl");
        System.out.println(friendsArrayList.get(0));

        // Remove an alement
        // Cant do that with arrays :(
        friendsArrayList.remove(1); 
        System.out.println(friendsArrayList.get(1));

        // Print    
        // Have to do a full for loop and iterate through each element
        for (int i = 0; i < friendsArrayList.size(); i++) {
            System.out.println(friendsArrayList.get(i));
        }
        System.out.println(friendsArrayList);
        
    }
}
