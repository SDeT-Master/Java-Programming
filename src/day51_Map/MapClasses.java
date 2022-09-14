package day51_Map;

import java.sql.Array;
import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        // every single class, has a wrapper class dedicated to them

        //      key, value
        Map<Integer,String> hashmap= new HashMap<>();
        hashmap.put(10,"Arthur");
        hashmap.put(20,"George");
        hashmap.put(3,"Jack");
        hashmap.put(40,"Emma");

        hashmap.put(5,"Isabella");
        hashmap.put(5,"Ahmed");

        hashmap.put(7,"Ahmed");
        hashmap.put(8,"Ahmed");
        hashmap.put(9,"Ahmed");

        hashmap.put(null,"Jihad");
        hashmap.put(null,"Emre");
        hashmap.put(null,"Hulya");

        //Hashmap is very fast, the disadvantage of hashmap is the order is random
        // when hashMaps keys are duplicated, the last one will be accepted, keys can not be duplicated
        // values can be duplicated

        System.out.println("hashmap = " + hashmap);
       // System.out.println(hashmap.get(1));


        Map<Integer, String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(5,"Ahmed");

        linkedHashMap.put(7,"Ahmed");
        linkedHashMap.put(8,"Ahmed");
        linkedHashMap.put(9,"Ahmed");

        linkedHashMap.put(null,"Jihad");
        linkedHashMap.put(null,"Emre");
        linkedHashMap.put(null,"Hulya");

        // order is always kept in order in Linked hashmap
        System.out.println("linkedHashMap = " + linkedHashMap);


        Map<Integer,String > treeMap=new TreeMap<>();
        // Maintains the sorted(Ascending) order
        // in the tree map, key can not be null, value can not be null and duplicated
        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Isabella");
        treeMap.put(5,"Ahmed");

        treeMap.put(7,"Ahmed");
        treeMap.put(8,"Ahmed");
        treeMap.put(9,"Ahmed");

        System.out.println("treeMap = " + treeMap);


        Map<Integer,String> hashtable=new Hashtable<>();

        hashtable.put(10,"Arthur");
        hashtable.put(20,"George");
        hashtable.put(3,"Jack");
        hashtable.put(40,"Emma");
        hashtable.put(5,"Isabella");
        hashtable.put(5,"Ahmed");

        hashtable.put(7,"Ahmed");
        hashtable.put(8,"Ahmed");
        hashtable.put(9,"Ahmed");

        hashtable.put(9,"Korea");

        System.out.println("hashtable = " + hashtable);
        

        // above are the 4 different objects of the map







    }
}
