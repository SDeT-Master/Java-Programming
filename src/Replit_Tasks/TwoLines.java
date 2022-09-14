package Replit_Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoLines {
    public static void main(String[] args) {
        String[] arr={"James","Jack","Dan","Dore","Christine","Vivian","Erkin","Elen"};
        for (int i = 0; i < arr.length ; i+=2) {
            System.out.println(arr[i]+" "+arr[i+1]);

        }

    }

}
