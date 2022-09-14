package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(11,22,2,3,5,4,2,53,1,1));

        ArrayList<Integer> unique= new ArrayList<>();
        for (Integer each : list) {
           int frequency= Collections.frequency(list,each);
            if(frequency==1){
                unique.add(each);
            }
        }
        System.out.println(unique);

        System.out.println("----------------------------");

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.addAll(Arrays.asList(11,11,2,3,5,4,2,53,1,1,2,5,244));
        ArrayList<Integer> unique2= new ArrayList<>(list2);
        unique2.removeIf(p-> Collections.frequency(list2,p)> 1); // p represents each element that we have;
        System.out.println("unique2 = " + unique2);


        System.out.println("---------------------------------------------");




    }
}
