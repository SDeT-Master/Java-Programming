package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 26 years old

        byte age = 26;

        // weight: 170 pounds


       // byte weight = 170; one 170 is out of Byte's range



        short weight= 170; // 170 is within the range of short,

        // salary: 1140000$

        //short salary= 114000; 1140000 is out of Short's range


        int salary= 1140000;

        //Int is the preferred data type for all variables


        //int WorldPopulation = 7_000_000_000; giving me compiler error because it is out of Int's range.


        long WorldPopulation= 7_000_000_000L;
        //always use a big L at the end of long. L stands for Long Primitive


        // tax: 0.26 percent



      //  float tax=0.26f;

        double tax=0.26;


//

        char ch1='#';
        System.out.println("ch1 = " + ch1);


char ch2=35;

        System.out.println("ch2 = " + ch2);


        char ch3=2321;
        System.out.println("ch3 = " + ch3);



char gender='F';

        System.out.println("gender = " + gender);



        {

            boolean isEmployed= true;
            boolean isMarried=false;


boolean result= 10<300;
            System.out.println("result = " + result);

            System.out.println("isMarried = " + isMarried);
            System.out.println("isEmployed = " + isEmployed);


            String name= "Sayimu";
            String city="\nArlington";
            String state ="\nVirginia";
            String country= "\nUSA";



            System.out.println("name = "+ name +city +state +country);

            // for text information String is preferred

        }
    }





}

