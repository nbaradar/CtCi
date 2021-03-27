import java.util.Scanner;
import java.util.Hashtable;

public class IsUnique{
    public static void main(String args[]){
        //determine if string has all unique characters

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();

        //Use a hash table, which takes O(1) insert. 
        Hashtable<String, String> table = new Hashtable<String, String>();
        char[] inputChar = input.toCharArray();

        //Check if collision while inserting, looping takes O(n), so this solution O(n+1)=O(n)
        for (char i : inputChar){
            if( table.putIfAbsent(String.valueOf(i), String.valueOf(i)) == null){
                table.putIfAbsent(String.valueOf(i), String.valueOf(i));
            } else {
                System.out.println("Duplicate character: " + i);
            }
        }
        System.out.print("No Duplicates Found!");
    }
}