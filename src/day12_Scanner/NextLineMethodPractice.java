package day12_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {


    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your age");
        int age =scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name");

        String fullName=scan.nextLine();

        System.out.println("Enter your GPA");
        double GPA= scan.nextDouble();
        scan.nextLine();


        System.out.println("Enter your school name");
        String schoolName= scan.nextLine();


        System.out.println("Age "+age);

        System.out.println("Full name "+fullName);

        System.out.println("GPA "+GPA);

        System.out.println("School name "+schoolName);


scan.close();


    }
}
