package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {




        int[] numbers={1,2,3,5,4,6,7,8,9};

        for (int i = 0; i < numbers.length; i++) {

            int eachElement=numbers[i];

            System.out.println(eachElement);

        }
        System.out.println("---------------");
        for(int each :numbers){
            System.out.println(each);

        }


    }
}
