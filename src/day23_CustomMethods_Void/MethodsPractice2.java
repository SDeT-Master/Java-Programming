package day23_CustomMethods_Void;

public class MethodsPractice2 {
    public static void main(String[] args) {
        helloCydeo5Times();
        helloWorld5Times();
        evenNumbers();
    }
    // create a function that can print hello world 5 times;

    public static void helloWorld5Times(){


        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }

    }



    // hello cydeo 5 times;
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {

        System.out.println("Hello Cydeo");

    }}


    // create a function that print all even numbers from 1-10;


    public static void evenNumbers(){
        for (int i = 2; i < 11; i++) {
            if(i%2==0)
                System.out.println(i);

        }

    }







}
