package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArrayPractice {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        int reversed[]= new int[numbers.length];

        int j=0;

        for (int i = numbers.length - 1; i >= 0; i--,j++) {
            reversed[j]=numbers[i];
        }

        System.out.println(Arrays.toString(reversed));

        int[] numbers2 = {10, 20, 30, 40,10, 20, 30, 40,10, 20, 30, 40};
        int reversed2[]= new int[numbers2.length];
        int f=0;
        for (int i = numbers2.length - 1; i >= 0; i--,f++) {
            reversed2[f]=numbers2[i];
        }
        System.out.println(Arrays.toString(reversed2));


        // reverse names
        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        String reversedNames="";
        for (String eachNames : names) {
            for (int i = eachNames.length()- 1; i >= 0; i--) {
                reversedNames+=eachNames.charAt(i);
            }
            System.out.println("reversedNames = " + reversedNames);
        }



    }
}
