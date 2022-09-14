package day08_IfStatement;

public class EvenlyDivisible {

    public static void main(String[] args) {



        int number=65;

        boolean DivisibleBy2= number%2==0;

        boolean DivisibleBy3= number%3==0;

        boolean DivisibleBy5=number%5==0;


        System.out.println( number +" is divisible by 2:  " + DivisibleBy2); // if the remainder of a number divided by 2 is zero, then it is evenly divisible by zero.
        System.out.println(number +" is divisible by 3 : " + DivisibleBy3);
        System.out.println(number+ " is divisible by 5 : " + DivisibleBy5);


        System.out.println("-------------------------------------------------");



        int year=2000;

        boolean isLeapYear= year%4==0;

        System.out.println(year+" is leap year = " + isLeapYear);




    }
}

/*2. Create a class called EvenlyDivisible,and write a program that can
check if a number is evenly divisible by 2, 3, 5
Ex:
number = 65;
output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true

 */