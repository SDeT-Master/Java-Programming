package Replit_Tasks;

import java.util.Arrays;

public class LargestNum {
    public static void main(String[] args) {
        int[][] twoDarr={{1,245,32,1,5,3,5,3},{1,0,99,31,4,5,3,6,432,5}};
        int max=twoDarr[0][0];
        for (int i = 0; i <= twoDarr[0].length-1; i++) {
            for (int j = 0; j <= twoDarr[1].length-1; j++) {
                if(twoDarr[i][j]>max){
                    max=twoDarr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
