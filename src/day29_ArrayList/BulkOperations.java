package day29_ArrayList;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        //in  bulk operation the argument must be a collection type
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,3,3,3));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8)); // removes all elements that are matching;

        System.out.println(list);
        System.out.println("----------------");

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,4000,500,900,500,700));

        numbers.retainAll(Arrays.asList(500)); // keeps the elements that are matching, removes the elements that are not here
        System.out.println(numbers);
        System.out.println("------------------------------");

        ArrayList<String> jobTiles= new ArrayList<>();
        jobTiles.addAll(Arrays.asList("QA","SDET","NUMbers","Go","Hanna"));
        jobTiles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTiles);

        System.out.println("-------------------");

        ArrayList<Integer> nums= new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        boolean r= nums.contains(10);

        boolean r1=nums.containsAll(Arrays.asList(1,2,3,12));

        System.out.println(r);
        System.out.println(r1);

        System.out.println("-------------------------------");

// Converting non-primitive to Array list
        String[] names={"Josh","Simon","Joe","Gosh"};
        ArrayList<String> namesList=new ArrayList<>(Arrays.asList(names));

        namesList.addAll(Arrays.asList(names));
        System.out.println(namesList);

        System.out.println("---------------");

        Integer[] arr={1,2,3,3,4,5,6,6};
        ArrayList<Integer> numList= new ArrayList<>(Arrays.asList(arr));
        System.out.println(numList);

        System.out.println("--------------------------");

        int[] arr2={1,2,3,3,4,5,6,690909};
        ArrayList<Integer> list3= new ArrayList<>(convertToArray(arr2));
        System.out.println(list3);

    }

    public static ArrayList<Integer> convertToArray(int[] array){
        ArrayList<Integer> list=new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }



}
