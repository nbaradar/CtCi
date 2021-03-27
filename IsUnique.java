import java.util.Scanner;
import java.util.Hashtable;

public class IsUnique{
    public static void main(String args[]){
        //determine if string has all unique characters

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();

        Hashtable<String, String> table = new Hashtable<String, String>();
        char[] inputChar = input.toCharArray();

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