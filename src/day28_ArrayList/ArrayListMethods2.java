package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(300);
        list.add(500);
        list.add(500);
        list.add(600);

        System.out.println(list);

        int num=1;
// Don't use remove method inside the loop;
        list.remove(num);
        System.out.println(list);


        Integer num1=100;
        list.remove(num1);
        System.out.println(list);


       //  list.remove("600"); // cant be done
      //   System.out.println(list);

        System.out.println("---------------------");
        System.out.println(list.size());
        list.clear();  // clears all elements from the Array list
        System.out.println(list);


        System.out.println("=====================================");

        ArrayList<Character> characters= new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');


       int a= characters.indexOf('A'); // 0
       int b= characters.lastIndexOf('A'); // 5

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        System.out.println("---------------------");



       boolean r= characters.contains('A'); // returns boolean
        System.out.println(r);

        boolean r1=characters.contains('Z');  // returns boolean
        System.out.println(r1);


        System.out.println("------------------------------");

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(100);
        list1.add(300);
        list1.add(200);

        ArrayList<Integer> list2= new ArrayList<>();

        list2.add(100);
        list2.add(300);
        list2.add(200);

        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));


        System.out.println("---------------------------");

        list1.clear();
        boolean empty=list1.isEmpty();
        System.out.println("empty = " + empty);


        System.out.println("-----------------");

        ArrayList<Integer> numbers= new ArrayList<>();

        //Bulk Operation
      numbers.addAll(Arrays.asList(1,23,4,34,24));
        System.out.println(numbers);





    }
}
