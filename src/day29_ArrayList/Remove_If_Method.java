package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_If_Method {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

/*
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.println(list);

 */
        list.removeIf( p -> p <5); // Lamda expression
        System.out.println(list);


        System.out.println("---------------");


        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each->each%2==0);
        System.out.println(list2);


        System.out.println("-----------");

        ArrayList<String> list3= new ArrayList<>();
        list3.addAll(Arrays.asList("Java","PythonJ","C Sharp","C++","John"));
        list3.removeIf(p-> p.startsWith("J"));
        System.out.println(list3);

        System.out.println("-----------------------------------");

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Yo","Anna","Level","Eye","Python","Cydeo"));
        names.removeIf(p-> !StringUtility.isPalindrome(p));
        System.out.println(names);

        System.out.println("--------------------------------");

    }
}
