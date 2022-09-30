package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GeneralPractices {
    public static void main(String[] args) {

        // Alphabets Task
        char[] alphabets = new char[26];

        char ch = 'Z';

        for (int i = 0; i < alphabets.length; i++, ch--) {

            alphabets[i] = ch;

        }
        System.out.println(Arrays.toString(alphabets));

        System.out.println("-----------------------------");

        // Appear Twice Task
        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D', 'F', 'F'};
        for (int i = 0; i < chars.length; i++) {
            char characters = chars[i];
            int freq = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == characters) {
                    freq++;
                }
            }
            if (freq == 2) {
                System.out.println("characters = " + characters);
            }

        }

        // A-Z
        char[] aToZ = new char[26];
        char alphabet = 'A';
        for (int i = 0; i < aToZ.length; i++, alphabet++) {
            System.out.println("alphabet = " + alphabet);
        }

        System.out.println("--------------------------------------------");

        // Print out numbers in array task
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int  length=scan.nextInt();

        if(length<=0){
            System.out.println("invalid entry");
            System.exit(0);
        }

       int nums[]=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            nums[i]=scan.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        scan.close();

 */

        // Array smallest to the largest numbers
        int[] numbers = {10, 9, 0, 1, 2, 20, 4, 6, 7, 8};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        // Find the average number
        int[] numbers2 = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int i = 0; i < numbers2.length; i++) {
            sum += numbers2[i];
        }

        double averageNum = sum / numbers2.length;
        System.out.println("averageNum = " + averageNum);

        // max number of an array
        // min number of an Array
        int[] numbers3 = {10, 5, 4, 20, 1, 0, 30, 6, 100};
        int max = numbers3[0];
        int min = numbers3[0];
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] > max)
                max = numbers3[i];
            if (numbers3[i] < min) {
                min = numbers3[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        System.out.println("-------------------------------------------");

        int[] numbers4 = {100, 500, 30, 40, 600, 80, -90};
        int minNum = numbers4[0];
        for (int i = 0; i < numbers4.length; i++) {
            if (numbers4[i] < minNum) {
                minNum = numbers4[i];
            }
        }
        System.out.println("minNum = " + minNum);


        System.out.println("-------------------------------------------");


        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo", "Olga"};
        for (int i = 0; i < words.length; i++) {
            String elements = words[i];
            int freq = 0;

            for (int j = 0; j < words.length; j++) {
                if (elements == words[j]) {
                    freq++;
                }
            }

            if (freq == 1) {
                System.out.println("elements = " + elements);
            }

        }


        System.out.println("-------------------------------------------");

        //3. Write a program that asks user to enter a number 10 times:
        //			1. store all user entered numbers in an array
        //			2. find the max number
        //			3. find the min number

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int numArr[] = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numArr));

        int maxNumber = numArr[0];
        int minNumber = numArr[0];
        for (int i = 0; i < numArr.length; i++) {
            if (maxNumber < numArr[i]) {
                maxNumber = numArr[i];
            }
            if (minNumber > numArr[i]) {
                minNumber = numArr[i];
            }
        }
        System.out.println("minNumber = " + minNumber);
        System.out.println("maxNumber = " + maxNumber);


    }
}
