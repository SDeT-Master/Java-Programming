package day15_ForLoops;

public class ForLoopPractices {

    public static void main(String[] args) {

        for(int i=15; i<=45; i++){

            System.out.print(i+" ");
        }

        System.out.println("\nHello World");


        System.out.println("-------------------------------");


        for(int i=100; i>=50;i--){
            System.out.print(i+" ");

        }

        System.out.println("------------------------------------------------");
        //Print all even numbers from 1~55;


        for (int i=1; i<=55; i++){


            if(i%2==0) {

                System.out.print(i + " ");
            }


        }

        System.out.println();

        //Print all even numbers from 1~55;


        for (int i=2; i<=54; i+=2 )
            System.out.print(i+"  ");




    }
}
