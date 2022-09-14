package Replit_Task2;

import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your sentence");
        String a= scan.nextLine();

        if(a.contains("alejandro")&& a.contains("project")){
            System.out.println("read");
        } else{
            System.out.println("dont read");
        }

    }
}
