package day04_Variables;

public class Circle {
    public static void main(String[] args) {

// PI, radius, diameter, area, perimeter

        double radius=5.5;

        double PI= 3.14;

        double diameter=radius*2; // diameter of a circle is radius *2
double area= radius*radius*PI; //radius * pi finds the area of a circle
double perimeter = diameter*PI; // perimeter= diameter* pi


        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        System.out.println("PI = " + PI);









    }



}
/*

3. Create a class named Circle, write a program that can calculate
the area & perimeter of any given Circle
PI, radius, diameter, area, perimeter
Hints: PI = 3.14
area =
radius * radius * PI
Perimeter =
2 * radius * PI


 */