package Replit_Tasks;

import java.sql.Array;
import java.util.Arrays;

public class MakeLast {
    public static void main(String[] args) {

        int[]numbers={1,2,3,4,5,6};
        int[] newNums= new int[numbers.length*2];
        newNums[newNums.length-1]=numbers[numbers.length-1];
        System.out.println(Arrays.toString(newNums));


        }
    }
