package Replit_Tasks;

import javax.swing.plaf.IconUIResource;
import java.io.FilterOutputStream;
import java.util.Arrays;

public class UniqueChar {
    public static void main(String[] args) {


        int[] numbers = {5, 5, 2, 2, 3, 4, 4};


        for (int i : numbers) {
            int unique = 0;

            for (int j : numbers) {
                if (j==i) {
                    unique++;
                }
            }


            if (unique == 1){
                System.out.println(i);
        }

        }

    }
}