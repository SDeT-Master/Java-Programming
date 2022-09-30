package Replit_Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int[] inhabitants={ scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),
        scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};

       // int[] inhabitants = {3, 909090, 0, 4, 3, 2, 7, 100};

        int day = 0;

        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

        while (true) {
            day++;
            for (int j = 0; j < inhabitants.length; j++) {

                if ( j < inhabitants.length-2 && inhabitants[j] == 0 && inhabitants[j+1] == 1  )

                {
                    inhabitants[j + 1] = inhabitants[j + 1] / 2;
                    j=j+2;
                    continue;

                } else if (inhabitants[j] == 0 && j < inhabitants.length - 1) {
                    inhabitants[j + 1] = inhabitants[j + 1] / 2;
                }

            }
            for (int i = inhabitants.length - 1; i >= 0; i--) {
                if ( i > 1 && inhabitants[i] == 0 && inhabitants[i - 1] == 1  ) {
                    inhabitants[i - 1] = inhabitants[i - 1] / 2;
                    i=i-2;
                    continue;
                }else if (i > 0 && inhabitants[i] == 0 ) {
                    inhabitants[i - 1] = inhabitants[i - 1] / 2;
                }

            }


            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            int sum = 0;
            for (int each : inhabitants) {
                sum += each;
            }
            if (sum == 0) {
                break;
            }
        }
        System.out.println("---- EXTINCT ----");

        }
    }
