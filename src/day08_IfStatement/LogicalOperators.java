package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        // in order for && and logic to be true, both of them have to be true
        // in order for ll or logic to be true, only one of them has to be true


        String name= "Steven";

        int age=19;

        String citizen="USA";

        boolean isEligible=age>=18 &&citizen=="USA";

        System.out.println(name+" is eligible to vote = " + isEligible);


        System.out.println("------------------------------------------------");







        String name2= "Josh";

        int creditScore= 800;

        int age2= 24;

        int income=90000;

        boolean isEligible2=creditScore>=700 && age2 >=21 && income>=70000;


        System.out.println(name+" is eligible for credit: " + isEligible2);


        // the only time the && operator gives true is when all conditions are true


        System.out.println("--------------------------------------------------------------------");



        String name3= "Shay";

        int age3=21;
        char gender='F';

        boolean isEligible3= age3>= 18&& (gender=='M' || gender=='F');

        System.out.println( name3+" is eligible to register : " + isEligible3);


        System.out.println("===========");



        String name4="James";

        String countryOfBirth="USA";

        boolean marriedToUSCitizen=false;
        boolean isEligible4= countryOfBirth=="USA" || marriedToUSCitizen==true;


        System.out.println(name4+" is eligible for US citizenship = " + isEligible4);




// in logical || operator, only one expression needs to true in order to return true;


        System.out.println("----------------------------------------");



        String student="Ali";

        double gpa=1.5;

        int familyIncome=40000;


        boolean isEligible5= gpa>= 3.5 || familyIncome<=60000;

        System.out.println(student+" is eligible for scholarship:  " + isEligible5);


        System.out.println("===================================================================");


        boolean result2=true;

        System.out.println("result2 = " + result2);

        boolean result3= !result2;
        System.out.println("result3 = " + result3);


        System.out.println("=================================================================");




        int score=85;

        boolean passed=score>=60;
        boolean failed =!passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);






    }
}

