package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scan.nextInt();


        System.out.println("Enter your gender");
        String gender= scan.next();

        scan.nextLine();
        System.out.println("Enter your full name");
        String fullName=scan.nextLine(); // if the previous method is not nextline, then you should provide one addtional nextline


        System.out.println("Enter your phone number");
        long phoneNumber= scan.nextLong();


        System.out.println("Enter your zipcode");
        int zipCode=scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your school name");
        String schoolName= scan.nextLine();


        System.out.println("Enter your city name");
        String cityName= scan.nextLine();


        System.out.println("Enter your state name");
        String state=scan.nextLine();

        System.out.println("Enter your building number");
        int buildingNumber= scan.nextInt();


        scan.nextLine();
        System.out.println("Enter your street name");
        String streetName=scan.nextLine();


        System.out.println();

        scan.close();


        System.out.println("fullName : " + fullName);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
        System.out.println("phoneNumber : " + phoneNumber);
        System.out.println("Address: \n\t"+buildingNumber+" "+streetName+ "\n\t"+cityName+" "+state+" "+zipCode);
        System.out.println("schoolName : " + schoolName);



    }

}
