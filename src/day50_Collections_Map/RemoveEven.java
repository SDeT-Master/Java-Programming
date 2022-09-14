package day50_Collections_Map;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEven {
    public static void main(String[] args) {

        Set<Integer> set= new LinkedHashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,10,321,32,53,1));

      //  set.removeIf(p-> p%2==0);
        // above is using Lamda expression to remove even numbers

       Iterator<Integer> it=set.iterator();
       while (it.hasNext()){
           if(it.next()%2==0){
               it.remove();
           }
       }

       // above is using While loop to remove even numbers



        System.out.println(set);

    }
}
