package day22_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {
    public static void main(String[] args) {

        String[] group1={"Jmaes", "Jone", "Jacup"};
        String[] group2={"Amaes", "Bone", "Cacup"};
        String[] group3={"Dmaes", "Fone", "Kacup"};

        String[][] groups=new String[3][]; // index: 0,1,2;

        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;


       // System.out.println(Arrays.toString(groups)); //toString() is only for one dimensional Array

        System.out.println(Arrays.deepToString(groups)); // to print multi-dimensional Arrays, I should use DeepString()method


        System.out.println("-------------------------------------------------");


        int[][] array2D ={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.deepToString(array2D));


        System.out.println(Arrays.toString(array2D[1]));


        System.out.println(array2D[2][2]); // I dont need to use deep String methods for this;




    }
}
