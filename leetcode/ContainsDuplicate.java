package leetcode;

import java.util.Arrays;
import java.util.Scanner;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        //1. You can create a hash table, and if collision happens on insert, duplicate occurs
        //2. You can do O(n^2) loops where you compare each int to the entire array. Least Efficient
        //3. You can sort the array first O(nlog(n)), then find duplicates with O(n)
public class ContainsDuplicate{
    public static void main(String args[]){
        int[] array = new int[]{1,1,1,3,3,4,3,2,4,2};
        int[] array2 = new int[]{1,2,3,4,5,6,7,8,9};

        System.out.print(checkDuplicates3(array2));



    }


    //Sort the array first
    public static boolean checkDuplicates3(int[] array){
        Arrays.sort(array);
        for (int x=0; x<array.length-1; x++){
            if (array[x] == array[x+1]){
                return true;
            }
        }
        return false;
    }
}