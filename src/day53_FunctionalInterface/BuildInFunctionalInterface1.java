package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterface1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome=(p)->{
            String reverse= new StringBuilder(p).reverse().toString();

            return  reverse.equalsIgnoreCase(p);};

        boolean result1=isPalindrome.test("level");

        System.out.println("result1 = " + result1);


        Predicate<Integer> isEven= p-> p%2==0;

        System.out.println("----------------");

        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,34,6,7,4,2,6,7,6));
        list.removeIf(p-> p%2==0);
        System.out.println("list = " + list);

        System.out.println("------------------");


        List<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Level","Anna","Python"));
        names.removeIf(isPalindrome);
        System.out.println("names = " + names);

        System.out.println("---------------------------------------------");

        Consumer<String> printEachChar = (s)->{
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };
        printEachChar.accept("hello world");


        System.out.println("----------------------------------------------------------------");


        List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        for (Integer each : list2) {
            if(each%2!=0){
                System.out.println(each);
            }
        }

        System.out.println("--------------------------------");

        list2.forEach(p-> {if(p%2==0) System.out.println(p);});



        System.out.println("--------------------------------");

        List<String> employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Jason","Aygun Hell","Christine Vivian","Ali Dawut","Ismail Erkin"));
        employees.forEach(p->{System.out.println(p.charAt(0)+" . "+p.charAt(p.lastIndexOf(" ")+1));
        });


        System.out.println("-----------------------------------------------");

        Function<int[],List<Integer>> convertToList= (a)->{
            List<Integer> result=new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return  result;
        };

        int[] arr={1,2,3,4,5,6,7,8,9};

        List<Integer> l=convertToList.apply(arr);

        System.out.println("l = " + l);

        System.out.println("------------------------------------------");





    }

}
