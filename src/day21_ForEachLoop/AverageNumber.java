package day21_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int[] numbers={2,4,43,5,53,52,3};
        double sum=0;

        for (int number : numbers) {
            sum+=number;

        }

        double average=sum/numbers.length;
        System.out.println(average);

    }
}
