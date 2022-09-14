package day51_Map;

import day37_Inheritance.Animal_Task.Parrot;

import java.util.*;

public class Map_Iteration {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Arthur", 10);
        students.put("George", 98);
        students.put("Jack", 76);
        students.put("Emma", 100);
        students.put("Isabella", 45);
        students.put("Ahmed", 60);
        students.put("Jason", 92);

        Set<String> keys = students.keySet();
/*
        for (String eachKey : keys) {

            //System.out.println(eachKey+" : "+students.get(eachKey));

            students.replace(eachKey,students.get(eachKey)+5);

        }

 */

        Map<String, Integer> earlyBirds = new HashMap<>();
        Map<String, Integer> angryBirds = new HashMap<>();

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >= 90) {
                earlyBirds.put(key, value);
            } else {
                angryBirds.put(key, value);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


        Set<String> names = students.keySet();
        System.out.println("names = " + names);

        System.out.println("---------------");


        Collection<Integer> scores = students.values();
        System.out.println(scores);


        System.out.println("----------------");

        int maxScore = Integer.MIN_VALUE;
        int minScore=Integer.MAX_VALUE;
        for (Integer score : students.values()) {
            if (score > maxScore) {
                maxScore = score;
            }

            if(score<minScore){
                minScore=score;
            }
        }


        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);


        int max= Collections.max(students.values());
        int min=Collections.min(students.values());

        System.out.println("min = " + min);
        System.out.println("max = " + max);


        //remove all students whose score is less than 90
         /*  for (String eachKey : students.keySet()) {
                Integer eachValue = students.get(eachKey);
                if (eachValue < 90) {
                    System.out.println(eachKey);
                }
            }
          */


        System.out.println("----------------------------");

        int count=0;
        // write a program that counts how many students has the score of 95 or greater
        for (Integer eachScore : students.values()) {
            if(eachScore>=95){
                count++;
            }
        }
        System.out.println("count = " + count);

        for (String eachKey : students.keySet()) {
            Integer eachSCore = students.get(eachKey);
            if (eachSCore >= 95) {
                count++;
            }
        }

        System.out.println("count = " + count);

        System.out.println("-------------------------------");


        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }





    }
}