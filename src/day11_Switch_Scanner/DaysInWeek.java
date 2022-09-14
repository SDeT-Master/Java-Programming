package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {  // Switch statement is faster, you can't use boolean with switch statements

        int number=5;

        switch (number){

            case 1:
                System.out.println("Monday");
                break;


            case 2:
                System.out.println("Tuesday");
                break;// exits the switch after executing the case block(the function of break keyword


            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;


            default: // default line gets executed if none of the case blocks are matching, very similar to else in function
                System.out.println("Entry error");
                break; // Using break is not mandatory if the default is used at the very end

        }





    }
}

/* Long cant not be accepted as data type
Float can not be accepted as data type
double can not be accepted as data type
boolean cant be accepted as data type
these data types can not be used in switch
 */