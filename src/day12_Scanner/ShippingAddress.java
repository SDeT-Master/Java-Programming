package day12_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);


        System.out.println("Enter your full name");
        String fullName= scan.nextLine();


        System.out.println("Enter your building number");
        String buildingNumber= scan.next();
        scan.nextLine();


        System.out.println("Enter your street name");
        String streetName= scan.nextLine();


        System.out.println("Enter your city name");
        String cityName= scan.nextLine();


        System.out.println("Enter your state");
        String state= scan.next();


        System.out.println("Enter your zipcode");
        String zipcode= scan.next();
scan.nextLine();


        System.out.println("Enter your country");
        String country= scan.nextLine();


        System.out.println(fullName+"\n"+buildingNumber+streetName+ cityName+ state+zipcode+country);


       /* System.out.println("Full name: "+fullName);
        System.out.println("Building number: "+buildingNumber);
        System.out.println("Street name: "+streetName);
        System.out.println("City name: "+cityName);
        System.out.println("Your state: "+state);
        System.out.println("Zip code: "+zipcode );
        System.out.println("Country: "+country);

        */


        scan.close();


    }
}
