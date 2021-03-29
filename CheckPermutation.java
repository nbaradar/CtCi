import java.util.Hashtable;
import java.util.Scanner;

public class CheckPermutation{
    public static void main (String[] args){
        //Check if one string is a permutation of the other

        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();
        String input2 = scan.nextLine();
        scan.close();

        char[] inp1 = input1.toCharArray();
        char[] inp2 = input2.toCharArray();

        Hashtable<Integer, Character> hash1 = new Hashtable<Integer, Character>();
        Hashtable<Integer, String> hash2 = new Hashtable<Integer, String>();

        int maxlength = (input1.length()>input2.length() ? input1.length() : input2.length());

        for (int x=0; x<maxlength; x++){
            if (inp1[x]!=0){
                hash1.put(inp1[x], inp1[x]);
            }
        }
        
    }
}