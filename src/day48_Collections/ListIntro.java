package day48_Collections;

import java.util.*;

public class ListIntro {
    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>();// for accessing the element arraylist is faster
        list1.addAll(Arrays.asList(1,2,3,4,4,56,76));
        System.out.println(list1.get(0));


        List<Integer> list2= new LinkedList<>();// for adding and removing elements, linked list is faster
        list2.addAll(Arrays.asList(1,2,3,4,4,56,76));
        System.out.println(list2.get(0));

        List<Integer> list3= new Vector<>();//
        list3.addAll(Arrays.asList(1,2,3,4,4,56,76));
        System.out.println(list3.get(0));


        List<Integer> list4= new Stack<>();
        list4.addAll(Arrays.asList(1,2,3,4,4,56,76));
        System.out.println(list4.get(0));

        System.out.println("---------------");

        System.out.println(list4);
        ((Stack) list4).pop();
        System.out.println(list4);
        ((Stack<Integer>) list4).pop();
        System.out.println(list4);

    }
    public synchronized void method1(){

    }


}
