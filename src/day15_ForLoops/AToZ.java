package day15_ForLoops;

public class AToZ {
    public static void main(String[] args) {

        for (char i='A'; i<='Z'; i++){     // A~Z
            System.out.print(i+" ");
        }

        System.out.println();

        for( char i='a'; i<='z';  i++){
            System.out.print(i+" ");
        }

        System.out.println();


        for (char i='z'; i>='a'; i--){

            System.out.print(i+" ");
        }

        System.out.println();


        for( char i='Z'; i>='A'; i--){

            System.out.print(i+" ");
        }

        System.out.println("-------------------------------------------");

       for(char i=1; i<=101; i++){

           System.out.print(i+" ");
        }




    }
}
