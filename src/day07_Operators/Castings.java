package day07_Operators;

public class Castings {

    public static void main(String[] args) {

        float averageScore=20.5f;

        byte num1=(byte)averageScore; // explicit casting

        short num2= (short) averageScore; // explicit casting

        int num3=(int)averageScore; // explicit casting

        float num4=averageScore; // No casting

        double num5=averageScore;  // implicit casting


        long num6= (long)averageScore;// explicit casting



        System.out.println("num1 = " + num1);

        System.out.println("num2 = " + num2);


        System.out.println("num3 = " + num3);

        System.out.println("num4 = " + num4);

        System.out.println("num5 = " + num5);

        System.out.println("num6 = " + num6);





    }
}

// Implicit casting; casting smaller number to larger number
// Explicit casting; casting bigger number to smaller numbers
