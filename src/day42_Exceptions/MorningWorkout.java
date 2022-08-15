package day42_Exceptions;

public class MorningWorkout {
    public static void main(String[] args) {

        // wow cool code
        System.out.println("-------------------Push up startted-----------------");

        for (int i = 1; i <=30 ; i++) {

            System.out.print("\rpush  up "+i); // r escape sequence keeps counting on the same line
           sleep(1.5);

        }

        System.out.println("\n-----push up completed-----");


        System.out.println("-----------Pull up started----------");

        for (int i = 1; i < 20; i++) {
            System.out.print("\rPull up "+i);
           sleep(2.5);
        }

        System.out.println("\n-------Pull up completed------------");


    }

    /*public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));

        } catch (InterruptedException e) {

          e.printStackTrace();

        }
    }

     */
    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }

}
