package Replit_Tasks;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] nums={1,2,4,5,56,7}; // this is a one dimensioal array, and these are the elements;
        int size=nums.length;// by nums.length, i can get the size and assign it to a temp var called size;
        Arrays.sort(nums);// in this method i can sort the arrays from smallest to the largest;
        System.out.println(Arrays.toString(nums));// here I can print the numbers from smallest to largest; this is optional
        int result=nums[size-1];// here I can get the number that occured at the end by subtracting -1;
        System.out.println(result);// finally I can print out the result;
    }
}
