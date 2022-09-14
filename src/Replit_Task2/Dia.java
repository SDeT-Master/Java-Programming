package Replit_Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Dia {
    public static void main(String[] args) {

        String[]arr={"nas","kas","jk"};
        String contains="";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("a")){
               contains+=arr[i]+", ";
            }

        }
       String[] result=contains.split(", ");
        System.out.println(Arrays.toString(result));
    }
}
