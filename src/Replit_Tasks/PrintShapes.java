package Replit_Tasks;

import java.util.Scanner;

public class PrintShapes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int as=scan.nextInt();

        for (int i = 1; i <=as ; i++) { // i is the beginning point, it means start with 'one' star
            // conditional i keeps printing stars as long as i is less than or equal to the number entered in scanner
            // increment by one each time
            {
                for (int j = 0; j < i; j++) { //  j's initialization point is zero, which is one star;
                    // if I initialise J with any other number, it will skip;
                    System.out.print("*");
                }
                }
            System.out.println();// this is responsible for printing them stars in new lines
        }

    }
}
