package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {


        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0,numbers.size()-1);

        System.out.println(numbers);


        /*int[] arr={1,2,3,111,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int max=arr[arr.length-1];
        System.out.println(max);

         */

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,4,6,0,7,0));

        System.out.println(list);
        int size=list.size();

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        int newSize=list.size();

        int totalNumberOf0=size-newSize;


        System.out.println("totalNumberOf0 = " + totalNumberOf0);

        for (int i = 0; i < totalNumberOf0; i++) {
            list.add(0);
        }

        System.out.println(list);


        System.out.println("-------------------------------------------");
        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,4,6,0,7,0));

        ArrayList<Integer> result=new ArrayList<>();
        for (Integer each : list2) {
            if(each!=0){
                result.add(each);
            }
        }
        for (Integer each : list2) {
            if(each==0){
                result.add(each);
            }
        }

        System.out.println(result);

        System.out.println("---------------------------------------------");

        String str="ABCSFDSJKL1#!$!#JFDSKAJK134F";

        ArrayList<Character> chars=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character> letters= new ArrayList<>(chars);// added all the characters
        letters.removeIf(p-> !Character.isLetter(p)); // removes the characters that are not letters
        System.out.println("letters = " + letters);// left with letters

        ArrayList<Character> digits= new ArrayList<>(chars);
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> specialChars=new ArrayList<>(chars);
        specialChars.removeAll(letters);
        specialChars.removeAll(digits);
        System.out.println("specialChars = " + specialChars);


    }
}
