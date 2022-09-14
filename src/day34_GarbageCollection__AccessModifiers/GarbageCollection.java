package day34_GarbageCollection__AccessModifiers;
import day30_CustomClass.Car;
import day30_CustomClass.Dog;
import day33_Statics.Student;
import day33_Statics.Test_iPhone;
import day33_Statics.iPhone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {

     //  new GarbageCollection().finalize();

       // int n= null; null keyword is assigned to non-primitive data types

      /*  String str=null; // null means nothing has been created;

        String str2=" ";// here the empty space is still considered an object

        System.out.println(str.toUpperCase());

       */


        String str="Wooden Spoon";
        str=null;// now it became a property of garbage || is eligible for garbage collection
        System.out.println(str);


        System.out.println("--------------");

        Dog dog1=new Dog();
        dog1.name="Lucy";

       dog1= new Dog();

        dog1.name="Max";

        System.out.println(dog1);


        System.out.println("---------------");

        String language="Python";
             language=            "Java";


        System.out.println(language);


        System.out.println("-------------------------------");

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2=list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);


        System.out.println(list1==list2);

        System.out.println("----------------------------------");


        Student student1=new Student("Tahir",'M',35,14,'B');
        student1.grade='A';

        Student student2=student1;
        student2.name="Ahmet";

        System.out.println(student1);
        System.out.println(student2);


        System.out.println("------------------------------");


        ArrayList<String> l1=new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2=l1;

        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);



    }
}
