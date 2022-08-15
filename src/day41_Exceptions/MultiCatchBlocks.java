package day41_Exceptions;

import day39_Recap.CydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee=null;

        try {
            System.out.println(employee.getSalary());
        } catch (IndexOutOfBoundsException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println(" Second Exepction");
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println(" Third Exception");
            e.printStackTrace();
            //  System.out.println(e.getMessage());
        }

        System.out.println("===========");

        System.out.println("TEST COMPLETED");

        //Parent Exception -----> Runtime Exception-----> can NOT be placed before child-other- exceptions;


        System.out.println("---------------------");


        try {
            System.out.println("Java".charAt(-1));
        } catch ( RuntimeException e){
            e.printStackTrace();
        }



    }

}
