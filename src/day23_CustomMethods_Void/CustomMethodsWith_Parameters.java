package day23_CustomMethods_Void;

public class CustomMethodsWith_Parameters {
    public static void main(String[] args) {
        oddOrEven(4325); // the method demands additional information to be completed.
        ageOfPerson(1996);
        printNumbers(0,1);


    }




    //create a function that can check if the number is odd or oven
    public static void oddOrEven(int num){
        if(num%2==0){
            System.out.println(num+" is oven number");
        } else{
            System.out.println(num+" is odd number");
        }


    }


    // create a function that can give you the age of the person

    public static void ageOfPerson(int birthYear){
        int age=2022-birthYear;
        System.out.println("Your age is: "+age);

    }



    // create a function that print all numbers between x and y;

    public static void printNumbers(int x, int y){
        for (int i = x; i < y; i++) {
            System.out.print(i+" ");
        }
        }



}
