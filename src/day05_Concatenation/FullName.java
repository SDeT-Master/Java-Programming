package day05_Concatenation;

public class FullName {


    public static void main(String[] args) {


        String firstName="Enver";
        String lastName="Sayim";

        int age=26;
        int salary=323_402;

        String jobTitle="JavaSdet";
        String company="International Business Machines";

        String fullName=firstName+" "+lastName;

        //The full name of the person is

        System.out.println("fullName of the person is: " + fullName);

        //_______is_______years old

        System.out.println(fullName+" is "+age+" years old and he works at "+company+"as as "+jobTitle+"and his salary is $"+salary);



    }
}
