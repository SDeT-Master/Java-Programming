package day21_ForEachLoop;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {



        String[] items = {"Shoes", "Jacket"};



        double[] prices = {99.9, 100.5};



        int[] itemIds = {123, 432};


        for (int i = 0; i < items.length; i++) {
            String item=items[i];
            double price=prices[i];
            int id=itemIds[i];

            System.out.println(item+"--"+id+"-- $"+price);

        }


    }
}