package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores= new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,20,21,42,89,25,73,89,63,99));

        ArrayList<Integer> gradeOfA= new ArrayList<>(scores);
        gradeOfA.removeIf(p-> !(p>=90 && p<=100));
        System.out.println("gradeOfA = " + gradeOfA);

        ArrayList<Integer> gradeOfB= new ArrayList<>(scores);
        gradeOfB.removeIf(p-> !(p>=80 && p<=89));
        System.out.println("gradeOfB = " + gradeOfB);

        ArrayList<Integer> gradeOfC= new ArrayList<>(scores);
        gradeOfC.removeIf(p-> !(p >= 70 && p<=79));
        System.out.println("gradeOfC = " + gradeOfC);

        ArrayList<Integer> gradeOfD= new ArrayList<>(scores);
        gradeOfD.removeIf(p-> !(p>=60 && p<=69));
        System.out.println("gradeOfD = " + gradeOfD);

        ArrayList<Integer> gradeOfF= new ArrayList<>(scores);
        gradeOfF.removeIf(p-> !(p<59));
        System.out.println("gradeOfF = " + gradeOfF);


        System.out.println("Total number of A: "+gradeOfA.size());
        System.out.println("Total number of B: "+gradeOfB.size());
        System.out.println("Total number of C: "+gradeOfC.size());
        System.out.println("Total number of D: "+gradeOfD.size());
        System.out.println("Total number of F: "+gradeOfF.size());


    }
}
