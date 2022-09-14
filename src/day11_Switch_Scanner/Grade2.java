package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {


        char ch='e';

        String result="";
        switch (ch){     // This is the only way I can use OR logic Switch statement
            case'A':
            case'B':
            case'C':
            case'D':
                result="Passed";
                break;

            case 'F':
                result="Failed";

            default:
                result="Invalid";
                break;


        }

        System.out.println(result);

    }
}
