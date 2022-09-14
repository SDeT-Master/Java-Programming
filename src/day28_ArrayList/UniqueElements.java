package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();

        list.add("Java"); //0
        list.add("Joe");//1
        list.add("Simon");//2
        list.add("Enver");//3
        list.add("Vivian");//4
        list.add("Vivian");//5
        list.add("Simon");//6
        list.add("Java");//7

        ArrayList<String> unique= new ArrayList<>();

        for (String each : list) {
            if(list.indexOf(each)==list.lastIndexOf(each)){
                unique.add(each);
            }
        }

        System.out.println(unique);


    }
}
