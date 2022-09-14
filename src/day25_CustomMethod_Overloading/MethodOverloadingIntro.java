package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {


        int[] intArr ={2,4,5,2,6,6};
        Arrays.sort(intArr);

        double[] doubleArr= {1.4,5.5, 4.3};
        Arrays.sort(doubleArr);

        char[] charArr={'A','B','C'};
        Arrays.sort(charArr);

        // Method Overloading is : multiple different methods sharing the same method name

        sumOfNumbers(10,20,20,20);


        // sum of 10, 20;
        int sum1=sumOfNumbers(10,20);
        System.out.println(sum1);

        // sum of three numbers
        int sum2=sumOfNumbers(10,20,30);
        System.out.println(sum2);

        // sum of two decimals
        double sumDouble=sumOfNumbers(10.4,10.7);
        System.out.println(sumDouble);
    }

    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    // parameters should be different for over loading;

    public static double sumOfNumbers(double num1, double num2, double num3){
        return num1+num2+num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;


    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }


    public static double sumOfNumbers(double num1, double num2, double num3, double num4, double num5){
        return num1+num2+num3+num4+num5;
    };


}
