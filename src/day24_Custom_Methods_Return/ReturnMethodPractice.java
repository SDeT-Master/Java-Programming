package day24_Custom_Methods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {


        // find the max number between 100& 200   // return method will let us use the data later on
        int max=maxNumber(5,100);
        System.out.println(max);

        // multiply the max number by 2

        int multiplication=max*2;
        System.out.println("multiplication = " + multiplication);
    }

    public static int maxNumber(int a, int b){
        int result=0;

        if(a>b){
            result=a;
        } else{
            result=b;
        }
     return result;  // in return method i dont need a print statement;

    }



}
