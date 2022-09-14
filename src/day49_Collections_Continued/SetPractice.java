package day49_Collections_Continued;


import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        String[]arr={"Wooden","Wooden","Wooden","Wooden","Milk","Egg","Paper towels","Paper towels"};
       arr= new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        System.out.println(Arrays.toString(arr));


        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(100,1000,10,102,321321,21,4,213,10,100,1000,4));
        list= new ArrayList<>( new LinkedHashSet<>(list));
        System.out.println(list);


        System.out.println("---------------------------------");

        String[] array={"A","B","C","D","A"};

        List<String> s=new ArrayList<>(Arrays.asList(array));

       // Set<String>s= new LinkedHashSet<>();
        s.addAll(Arrays.asList("E","F","G")); // return type of as list is list
        System.out.println(s);

        System.out.println("--------------------------------");

        String str="aaaaaaaaaabbbbbbcbccddeeeeee";
                        //  abcde
                        //44435
        String result="";
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
           int count= Collections.frequency(Arrays.asList(str.split("")),each);
            result+=each+count;
        }
        System.out.println(result);

        System.out.println("----------------------------");
        Integer[] nums={1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};
        nums=new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);// we should always give 0 to the Integer argument
        System.out.println(Arrays.toString(nums));


        System.out.println("------------------------");

        Set<String> names= new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet","John"," James","Breanna","Shay","Ahmet"));
        System.out.println(names.toArray(new String[0])[2]);

        System.out.println(new ArrayList<>(names).get(4));

        for (String each : names) {
            System.out.println(each);
        }

        /*
        Set<String>set1= new HashSet<>(Arrays.asList(arr));
        arr=set1.toArray(new String[0]);// convert it back to array method

        System.out.println(set1);
        System.out.println(Arrays.toString(arr));

        /*

    }

         */
    }
}