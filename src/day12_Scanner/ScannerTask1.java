package day12_Scanner;

import java.util.Scanner;

public class ScannerTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people do you live with?");

        String howMany=scan.nextLine();


        int people=06;

        if(people<=3){
            howMany="Live with less than 3 people";
        } else if(people>=3 && people<=6){
            howMany="Live with 3-6 people";
        } else if(people>=6){
            howMany="Live with more than 6 people";

        }else{
            howMany= "Invalid Entry";
        }

        System.out.println(howMany);


        scan.close();

        // Solution 2//


        System.out.println("--------------------------------------------------------------");



        Scanner scan2= new Scanner(System.in);
        System.out.println("How many people do you live with ?");

        System.out.println();






    }
}



/*1. Ask the user how many people they live with:
if user lives with Less than 3 people: print "Live with less
than 3 people"
if the user lives with 3 - 6 people: print "Live with 3 - 6
people"
if the user lives with more than 6 people: print "Live with
"more than 6 people"

 */