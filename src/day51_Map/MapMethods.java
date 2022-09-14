package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        // student name, score of the student

        Map<String,Integer> students= new HashMap<>();
        students.put("Aygun",85);
        students.put("Maria",86);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",96);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",95);
        students.put("Ali",95);
        students.put("Ali",95);


        System.out.println("students = " + students.size());
        // display score of Alex
        System.out.println("students.get(\"Ali\") = " + students.get("Ali"));

        // replace ali score to 90
        System.out.println("students.replace(\"Ali\",95,90) = " + students.replace("Ali", 95, 90));

        System.out.println("students.replace(\"Ali\",90) = " + students.replace("Ali", 90));

        boolean r1=students.containsKey("Simon");
        System.out.println(r1);

       boolean r2= students.containsKey("Ali");
        System.out.println(r2);

        boolean r3=students.containsValue(97);
        System.out.println(r3);

        System.out.println("-----------------------");

        Map<String,Integer>map1=new HashMap<>();
        map1.putAll(students);

        Map<String,Integer>map2=new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1.equals(map2));
        //System.out.println(map1==map2);

        // create a map that contains group ID and names of group members

       // Map<Integer, List<String>>map=new HashMap<>();




    }
}
