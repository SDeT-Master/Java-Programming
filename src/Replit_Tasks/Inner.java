package Replit_Tasks;

import java.util.Arrays;

public class Inner {
    public static void main(String[] args) {

        int[]outer={1,2,3,4,5,6};
        int[]inner={1,2};

        int i=0;
        int j=0;

        while(i < inner.length && j < outer.length) {

            if(inner[i] > outer[j]) {
                j++;
            } else if(inner[i] < outer[j]) {
                System.out.println("false");
            } else {
                i++;
            }
        }

        if(i != inner.length){
            System.out.println("false");}
    else{

        System.out.println("true");}
    }

}
