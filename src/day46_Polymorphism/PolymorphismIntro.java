package day46_Polymorphism;

import day44_Abstraction.animalTask1.Animal;
import day44_Abstraction.animalTask1.Dog;
import day44_Abstraction.animalTask1.Playable;
import day45_Abstractions.shape.*;

public class PolymorphismIntro {
    public static void main(String[] args) {

        String str="WoodenSpoon";

        Integer n1=2;

        Double b2=5.5;

        Boolean r1=true;

        Object[] array={n1,str,b2,r1,new Circle(4),new Square(3)};

        /*

        Webdriver driver;

        driver= new ChromeDriver();

        driver =new FirefoxDriver();

         */

        Animal animal =new Dog("Max","Husky",'M',4,"Small","White");
        animal.drink();
        animal.eat();
       // animal.play();
       // animal.bark();

        Playable animal2=new Dog("Max","Husky",'M',4,"Small","White");
        System.out.println(animal2.isFriendly);
        animal2.play();


        Animal animal3=new Dog("Max","Husky",'M',4,"Small","White");


        Shape shape=new Circle(4);
        shape.area();


        //System.out.println(shape.getRadius());
       // System.out.println(shape.pi);


        boolean isSquare= shape instanceof Square;
        boolean isRectangle= shape instanceof Rectangle;
       // boolean isTriangle=shape instanceof Triangle;
        boolean isCircle=shape instanceof Circle;


        System.out.println("isSquare = " + isSquare);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isCircle = " + isCircle);



    }
}
