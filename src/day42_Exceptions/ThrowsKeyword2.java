package day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args)throws ArithmeticException {


        System.out.println("Test Started");


        System.out.println(8/0);


        System.out.println("Test Completed");



        // checked exceptions can be handled both throws keyword and try and catch method

    // it is not good to use throws keyword with unchecked exceptions

    }
}
