package day52_Map_FunctionalInterface;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEachChars;
        printEachChars =s -> {
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };

        printEachChars.test("Wooden Spoon");



        MySecondFunctionalInterface<Integer> cube =n-> System.out.println(n*n*n);

        cube.test(5);

    }
}
