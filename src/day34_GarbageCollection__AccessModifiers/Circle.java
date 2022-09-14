package day34_GarbageCollection__AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius; // instance var
    public static double pi=3.14; // static var

    public static String name="Circle";

    public static ArrayList<Integer> numbers;


    // static accepts only statics

    public Circle(double radius){
        this.radius=radius;
    }

    static {
       pi=3.14;
       name="Circle";

       numbers=new ArrayList<>();
       numbers.add(19);
       numbers.add(20);

    }



  /*  public static void main(String[] args) {
        pi=3.14;
        name="circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(11);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }



   */



}
