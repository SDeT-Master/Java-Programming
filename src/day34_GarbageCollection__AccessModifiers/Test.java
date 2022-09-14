package day34_GarbageCollection__AccessModifiers;

import static day34_GarbageCollection__AccessModifiers.Circle.*;

import static utilities.ArraysUtility.sum;

public class Test {
    public static void main(String[] args) {


        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);


        System.out.println("-------------------------------------");

       int total=sum(100,200);

        System.out.println(total);



    }
}
