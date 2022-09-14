package day20_Arrays;

public class MaxNumOfArray {
    public static void main(String[] args) {



        int[] numbers= {10, 5, 4, 20, 1 , 0};
        int max=numbers[0];  // 10


        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]> max){ // if there is element in the array that is greater than current max number
                max=numbers[i];
            }

        }


        System.out.println("max = " + max);



    }
}
