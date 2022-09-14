package day49_Collections_Continued;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {


        // list has index numbers
        List<Integer> list=new ArrayList<>(); // list accepts duplicated elements
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println();


        // hashset has the fastest performance among the three;
        Set<Integer> hashSet= new HashSet<>(); // hashSet does not accept duplicated elements
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null,null,null));
        System.out.println(hashSet);
      //  System.out.println(hashSet.get(4));
        // you cant get element by using index numbers in hashSet


        

        Set<Integer> linkedHashSet= new LinkedHashSet<>();
        // maintains the insertion order
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(null,null,null));
        System.out.println();
        System.out.println(linkedHashSet);
        



        Set<Integer> treeSet= new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
      //  treeSet.addAll(Arrays.asList(null,null,null));
        // Treeset doesnt accept null keyword
        System.out.println();
        System.out.println(treeSet);



    }
}
