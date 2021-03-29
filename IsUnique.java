import java.util.Scanner;
import java.util.Hashtable;

public class IsUnique{
    public static void main(String args[]){
        //determine if string has all unique characters

        System.out.print("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();

        //IsUnique.useHashTable(input);
        //IsUnique.useArray(input);
        IsUnique.noDataStructures(input);
    }

    public static void useHashTable(String input){
        //Use a hash table, which takes O(1) insert. 
        Hashtable<String, String> table = new Hashtable<String, String>();
        char[] inputChar = input.toCharArray();

        //Check if collision while inserting, looping takes O(n), so this solution O(n+1)=O(n)
        for (char i : inputChar){
            if( table.putIfAbsent(String.valueOf(i), String.valueOf(i)) == null){
                table.putIfAbsent(String.valueOf(i), String.valueOf(i));
            } else {
                System.out.println("Duplicate character: " + i);
                return;
            }
        }
        System.out.println("No Duplicates Found!");
    }

    public static void useArray(String input){
        //Use an array where you store a boolean value for each character that can be represented. 
        //In ASCII, there are 256 total characters (0-255), but 128 of them are extended codes. So really, you only need
        //to store 128 characters. http://www.asciitable.com/

        boolean[] charArray = new boolean[127];

        for (Character x : input.toCharArray()){
            if (charArray[x] != true){
                charArray[x] = true;
            } else {
                System.out.println("Duplicate character: " + x);
                return;
            }
        }
        System.out.println("No Duplicates Found!");
    }

    public static void noDataStructures(String input){
        //This is possible, but slow. It takes 2 loops, which is O(n^2). So... not the best solution.
        //But maybe you have a specific requirement regarding memory allocation
        for (int x=0; x<input.length(); x++){
            char currentLetter = input.charAt(x);
            for (int y=0; y<input.length(); y++){
                if (currentLetter == input.charAt(y) && y!=x){
                    System.out.println("Duplicate character: " + currentLetter);
                    return;
                }
            }
        }
        System.out.println("No Duplicates Found!");
    }
}