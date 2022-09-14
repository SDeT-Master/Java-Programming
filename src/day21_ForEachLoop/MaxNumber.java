package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers= {4,35,6432,1,3543,6,432,43,2};
        int max=numbers[0];


        for(int each :numbers){
            if(each > max){
                max = each;
            }
        }

        System.out.println(max);


    }
}
