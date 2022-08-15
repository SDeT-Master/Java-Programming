package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_Catch_Blocks {
    public static void main(String[] args) {
        System.out.println("Test Started");



        try{
            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception Caught");

        }

        System.out.println("Test1 Completed");

        System.out.println("------------------------------------------");


        System.out.println("Test 2 Started");


        int[] numbers={1,2,3,4,5};

        try {
            System.out.println(numbers[200]);

            System.out.println("Try Block");


        } catch (RuntimeException e){

            System.out.println("Catch Block");

            System.out.println("Runtime exception was occurred");

           // e.printStackTrace(); // gives all the details of my unchecked exception
            System.out.println(e.getMessage()); // gives me a short message about the exception that occurred;
        }

        System.out.println("Test2 Completed");


        System.out.println("---------------");

        System.out.println("Test 3 started");

        try{
            System.out.println("Cydeo".substring(2,0)); //will give  unchecked exception

        } catch (RuntimeException e){
            e.printStackTrace(); // gives full detail of exception
        }


        System.out.println("Test 3 completed");


        // all the runtime exceptions are unchecked exception


        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Cydeo");


        System.out.println("------------------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e){
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}

// multi catch block is only for unchecked exceptions