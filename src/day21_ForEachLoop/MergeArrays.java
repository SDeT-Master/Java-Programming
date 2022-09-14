package day21_ForEachLoop;

import java.util.Arrays;

public class MergeArrays { // interview questions

    public static void main(String[] args) {


        String[] group1 = {"James", "John", "Simon", "Kristine", "Ali", "Koop"};
        String[] group2 = {"Leyla", "Munire", "Elif"};


        int i = 0;

        String[] students = new String[group1.length + group2.length]; //
        for (String each : group1) {
            students[i++] = each;

        }

        for (String each : group2) {
            students[i++] = each;

        }


        System.out.println(Arrays.toString(students));


        System.out.println("------------------------");


        char[] ch1={'A','B','C'};
        char[] ch2={'D','E','F'};


        char[] chars=new char[ch1.length+ ch2.length];

        int j=0;

        for (char ch : ch1) {
            chars[j]=ch;
            j++;

        }
        for (char ch : ch2) {
            chars[j]=ch;
            j++;

        }

        System.out.println(chars);

    }

}
