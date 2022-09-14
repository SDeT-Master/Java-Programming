package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that is capable enough to contain 5 names;


        String [] myGroup= new String[5];      // data types should match


        myGroup[0]="Erkin";
        myGroup[1]="john";
        myGroup[2]="Ase";
        myGroup[3]="gAP";
        myGroup[4]="jk";


       // System.out.println(myGroup); // hashcode
        System.out.println(Arrays.toString(myGroup));


        System.out.println("-------------------------");

        String[] days = {"Monday", "Tuesday", " Wednesday", "Thursday" , "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));


        int num=1;
        if(num<1  || num>7){
            System.out.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[num-1]);


        System.out.println("----------------------------");





    }
}
