package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {


    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your full name: ");

       String fullName= scan.nextLine();


        System.out.println("Enter your programming language");

        String program= scan.nextLine();

        System.out.println("Enter your age");

        int age=scan.nextInt(); // 24Enter

        scan.nextLine();

        System.out.println("Enter your school name");

        String schoolName=scan.nextLine();


        System.out.println("fullName "+ fullName);
        System.out.println("Programming "+program );
        System.out.println("age "+age);
        System.out.println("School name "+schoolName);

        scan.close();


    }
}

// nextLine method is not going to ignore the enter key