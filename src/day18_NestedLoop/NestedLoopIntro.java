package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {


        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");

        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");

        }

        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");

        }

        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");

        }

        System.out.println("--------------------------");

        // nested loop means loop inside another loop
        // one iteration of the outer loop, executes all the other inner loops

        for (int j = 0; j < 2; j++) { // the responsibility of outer loop is to repeat the inner loop
            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");

            }

        }





    }
}
