package Replit_Tasks;

import java.util.Arrays;

public class avarageTemp {

    public static void main(String[] args) {


        double[] avarage = {70,54,90,43,99,6,543,543,543,543};

        double temp=0;

        for (int i = 0; i < avarage.length; i++) {

            temp+=avarage[i];
        }
        System.out.println(temp/avarage.length);


    }
}
