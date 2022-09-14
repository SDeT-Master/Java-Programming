package Replit_Tasks;

import java.util.Scanner;

public class Property {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //DO NOT CHANGE
        int houseTypeInt=0;
        int propertyPrice=0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);



        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE


        System.out.println("Enter your property type:");
        houseType=scan.next().toLowerCase();

        switch(houseType)
        {
            case "Condo"://1
                propertyPrice=50000;
                houseTypeInt=1;
                break;

            case "Townhouse"://2
                propertyPrice=75000;
                houseTypeInt=2;
                break;

            case "Single Family Home"://3
                propertyPrice=95000;
                houseTypeInt=3;
                break;
        }
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms=scan.nextInt();
        propertyPrice+=numberOfBedrooms*30000;


        System.out.println("Do you have a backyard?");
        backyard=scan.nextBoolean();
        if(backyard){
            if(houseType=="Condo"){
                System.out.println("Backyard is not available for Condo");
            } else{
                propertyPrice+=5000;
            }
        }

        System.out.println("Do you have garage?");
        garage=scan.nextBoolean();
        if(garage){
            System.out.println("How many spots?");
            garageSpots=scan.nextInt();
            if(garageSpots<=10){
                propertyPrice+=(garageSpots*20000);
            } else{
                System.out.println("it's not a public parking");
            }
        }

        System.out.println("How close is metro station?");
        metroAccessibility=scan.nextFloat();
        if(metroAccessibility<=1){
            propertyPrice+=10000;

        } else if(metroAccessibility>1 && metroAccessibility<3){
            propertyPrice+=5000;
        }


        System.out.println("How close is highway?");
        highwayAccessibility=scan.nextFloat();
        if(highwayAccessibility<=1){
            propertyPrice+=15000;
        }else if(highwayAccessibility>1 && metroAccessibility <5){
            propertyPrice+=8000;
        } else if(metroAccessibility>=5 && metroAccessibility>20){
            propertyPrice+=4000;
        }


        System.out.println("What's the rating of nearest school?");
        schoolScore=scan.nextFloat();
        if(schoolScore<4){
            propertyPrice+=5000;
        } else if(schoolScore>=4 && schoolScore<8){
            propertyPrice+=20000;
        }else if(schoolScore>=8 && schoolScore<=10){
            propertyPrice+=45000;
        }


        System.out.println("Does any of your family members smoke?");
        smoking=scan.nextBoolean();
        if(smoking){
            propertyPrice-=5000;
        }


        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+propertyPrice+"$");


    }}
