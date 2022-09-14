package Replit_Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3,4},{1,2,3,4}};

        int max=numbers[0][0];
        for (int[] number : numbers) {
            for (int i : number) {
                if(i>max){
                    max=i;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j]=max;
            }

        }

        System.out.println(Arrays.deepToString(numbers));

    }
}
