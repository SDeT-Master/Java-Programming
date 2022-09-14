package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // add method inserts element at given index

        numbers.add(10);// 0 // auto boxing;
        numbers.add(20);//1
        numbers.add(30);//2
        numbers.add(40);//3
        numbers.add(50);//4
        numbers.add(60);//5
        numbers.add(2, 25); // inserting
        numbers.add(5, 45);

        System.out.println(numbers);

        // Size returns the total number of elements

        System.out.println(numbers.size());

        int lastIndex = numbers.size() - 1;
        System.out.println("lastIndex = " + lastIndex);


        int num = numbers.get(3); // unboxing
        System.out.println(num);
        System.out.println("--------------------");


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        System.out.println("--------------------------------");


        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        list.add("Cydeo");

        list.set(2, "JavaScript"); // set method is similar to replace method;
        list.set(3, "C++"); // when you use set method, size will not be changed;

        System.out.println(list);

        System.out.println("----------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Joe");
        employees.add("Koe");
        employees.add("Loe");
        employees.add("Mike");
        employees.add("Haiden");
        employees.add("Hoola");
        employees.add("Bek");
        employees.add("Kyle");


        System.out.println(employees);

        employees.remove(0);
        employees.remove(0);
        employees.remove(0);

        System.out.println(employees); // removes the element at given index, only removes one index;

        employees.remove(1);
        System.out.println(employees);

        employees.remove(employees.size() - 1);
        System.out.println(employees);

        employees.remove("Bek"); // removing by object;
        System.out.println(employees);


       boolean r2= employees.remove("Mike");
        System.out.println(r2); // true

        boolean r3= employees.remove("M");
        System.out.println(r3); // false

    }
}