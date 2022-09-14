package day27_WrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int num1=200; // converting primitive to object is called auto boxing;

        Integer n1=num1; // auto boxing

        int num2=n1; // unboxing; is implicitly done;

        System.out.println("------------------------------------------");


        Integer integerValue=100;
        long longValue=integerValue;

        Byte b1=25;
        byte a1=b1;
        short a2=b1;
        int a3=b1;
        long a4=b1;
        // unboxing allows you to convert to any primitive data type

        System.out.println("------------");


        int num3=200;
        Integer num4=num3; // autoboxing

        System.out.println("--------------------------");

        Integer z=900;
        Integer y=z;

        System.out.println("-------------------------");

        int[] numbers={1,2,2,3,4,5};
        Integer[] numbers2= {1,2,3,4,5};

        // parse Method  : Converts string to primitive
        // valueOf method



    }


}
