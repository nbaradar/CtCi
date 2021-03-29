package leetcode;

import java.util.Arrays;
//Given an array, rotate the array to the right by k steps, where k is non-negative.

//Theres also a solution where instead of using another array, you instead keep track of the positions that you are switching around.
public class RotateArray {
    static int[] arr1 = new int[]{-1,-100,3,99};
    static int[] newArr = new int[arr1.length];
    public static void main(String args[]){
        
        int k = 3;

        System.out.println(Arrays.toString(arr1));
        rotate(arr1, k);
        System.out.println(Arrays.toString(newArr));
    }


    public static void rotate(int[] nums, int k) {
        
        for (int index=0; index<nums.length; index++){
            if(k+index > nums.length-1){
                newArr[(k+index)%(nums.length)]=nums[index];
            }else{
                newArr[k+index] = nums[index];
            }
        }
    }
    
}
