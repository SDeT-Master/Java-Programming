package day33_Statics;

public class iPhone {

    // static means common for every single object
    public static String brand= "Apple";
    public String model;
    public double price;
    public static String OS="iOS";
    public String color;
    public String size;
    public static String madeIn="China";
    public static boolean hasBattery=true;
    public static  boolean isTouchScreen=true;
    public  static boolean hasFaceTime=true;

  //  public static void printModelAndPrice(){ // static method belongs to class
       // System.out.println(model+" : "+price);// static method doesnt accept instances, static only accepts static methods
   //
    //}

    public static void printOperatingSystem(){
        System.out.println(OS);
    }
    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }




}
