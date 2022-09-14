package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees= new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","Ahmet","David","Joe","Biden","Nora"));
        employees.retainAll(Arrays.asList("Ahmet","David"));
        System.out.println(employees);


        System.out.println("---------------");
        // remove all names that start with M
        String[] names={"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};
        ArrayList<String> removed=new ArrayList<>(Arrays.asList(names));
        removed.removeIf(p-> p.startsWith("M"));
        System.out.println(removed);
       names= removed.toArray(new String[0]);
        System.out.println(Arrays.toString(names));

    }
}
