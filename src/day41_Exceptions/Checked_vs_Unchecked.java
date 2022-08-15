package day41_Exceptions;

import day39_Recap.CydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {



        // unchecked exceptions

        // whenever compiler error occurs during the runtime, it is called unchecked exception


        int a=10;
        int b=0;

       // System.out.println(a/b);   // unchecked exception

       // System.out.println("Wooden Spoon");


        char[] characters={'A','B','C'};  //-----> this will give me an unchecked exception
       // System.out.println(characters[99]);  //----> it will give me an unchecked exception


      //  Student student=null;
      //  System.out.println(student.getName()); //----> thi is another example of unchecked exception



        final String str="Wooden Spoon";

        System.out.println(str.toUpperCase());//------>Unchecked Exception


        String str2="";
        System.out.println(str2.isEmpty());


        // Unchecked exception occur only during the runtime

        //Checked Exception
        System.out.println("Hello");

      //  Thread.sleep(3000);-----> Checked Exception

        System.out.println("Cydeo");


      //  FileInputStream file=new FileInputStream("path of the file"); --------->>> Checked Exception;

        //Checked exception is normally easier to handle


        System.out.println("Java".charAt(20000));//------->>> unchecked exception


        // all the runtime exceptions are unchecked exceptions

    }
}
