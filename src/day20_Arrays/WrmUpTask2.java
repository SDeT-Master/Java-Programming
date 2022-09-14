package day20_Arrays;

import java.util.Arrays;

public class WrmUpTask2 {
    public static void main(String[] args) {
        int[] nums=new int[101];

        int[] reversedNums= new int[nums.length];

        for (int i = 0; i < 101; i++) {
            nums[i]=i;
        }
        System.out.println(Arrays.toString(nums));

        for (int i = nums.length-1, j=0; i >=0 ;j++, i--) {
            reversedNums[j]=nums[i];
        }

        System.out.println("reversedNums = " + Arrays.toString(reversedNums));
    }
}
/*
2. create an array that has the numbers 100 to 1
 */