package Replit_Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        int[] nums={1};



       int[] goLeft= new int[nums.length];
        for (int i = 0; i < nums.length-1; i++) {
            goLeft[i]=nums[i+1];
        }
        goLeft[goLeft.length-1]=nums[0];
        System.out.println(Arrays.toString(goLeft));


    }

}
   /* int toTheLeftTemp= nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            nums[i]=nums[i+1];

        }
        nums[nums.length-1]=toTheLeftTemp;
        System.out.println(Arrays.toString(nums));


        */