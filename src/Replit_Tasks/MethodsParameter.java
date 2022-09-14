package Replit_Tasks;

public class MethodsParameter {
    public static void main(String[] args) {
        displayValue(1);
        eligibleToVote(21,true);
        evenOrOdd(200);
    }

    public static void displayValue(int num) {
        System.out.println("The value is " + num);

    }


    public static void eligibleToVote(int age, boolean isUSCitizen) {
        if (age >= 18 && isUSCitizen) {
            System.out.println("Eligible to Vote");

        } else {
            System.out.println("not  eligible to vote");
        }

    }


    public static void evenOrOdd(int num){
        if(num%2==0){
            System.out.println(num+" Even number");
        } else{
            System.out.println(num+"  Odd number");
        }


    }







}
