package ch1_problems;

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
        Hashtable<Integer, Character> hash2 = new Hashtable<Integer, Character>();

        int maxlength = (input1.length()>input2.length() ? input1.length() : input2.length());

        for (int x=0; x<maxlength; x++){
            if (x < inp1.length && inp1[x]!=0){
                hash1.put(Integer.valueOf(inp1[x]), Character.valueOf(inp2[x]));
            }
            if (x < inp2.length && inp2[x]!=0){
                hash2.put(Integer.valueOf(inp2[x]), Character.valueOf(inp2[x]));
            }
        }
        
        if (hash1.equals(hash2)){
            System.out.print("Strings are permutation of each other.");
        } else {
            System.out.print("Strings are unique");
        }
    }
}