package day47_Polymorphism_Continued;

import day39_Recap.CydeoTask.Employee;
import day39_Recap.CydeoTask.Tester;
import day43_Abstraction.employee.Driver;
import day43_Abstraction.employee.Person;
import day43_Abstraction.employee.Teacher;
import day44_Abstraction.animalTask1.Animal;
import day44_Abstraction.animalTask1.Cat;
import day44_Abstraction.animalTask1.Dog;
import day45_Abstractions.shape.Circle;
import day45_Abstractions.shape.Cube;
import day45_Abstractions.shape.Shape;
import day45_Abstractions.shape.Square;

public class ReferenceTypeCasting {
    public static void main(String[] args) {


     //   Shape shape= (Shape) new Circle(4);
        Shape shape2= new Circle(5);

        Animal animal=new Dog("George","Husky",'M',3,"Small","White");
        Dog dog=(Dog) animal;

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        // animal.bark();
      //  dog.bark();


        Shape shape1= new Square(5);
        System.out.println(((Square) shape1).getSide());

        System.out.println("----------------------------------------");

        Animal animal2= new Cat("Max","Scotish",'M',1,"Big","White");
      //  Cat cat= (Cat) animal2;
    //    cat.meow();

        ((Cat) animal2).meow();

        System.out.println("-------------------------------------");

        Employee employee= new Tester("Ali",21,'M',123,"Tester",432111);


        System.out.println("---------------");


        //  Driver driver= (Driver) employee;
       // Person person= (Person) employee;
       // Teacher teacher=(Teacher) employee;

        Shape s1= new Circle(10);
        s1.area();
        s1.perimeter();
        s1.volume();


     //   ((Cube)s1).volume(); will give me ClassCastException

    }
}
