package day21_ForEachLoop;

import java.util.Arrays;

public class GeneralPractice {
    public static void main(String[] args) {
        // Anagram
        String str1 = "cinema";
        String str2 = "iceman";

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("anagram = " + anagram);

        // ArrayPractice
        //find min and max score without using for loop
        int[] scores = {95, 100, 55, 65, 85, 78};
        Arrays.sort(scores);
        System.out.println("Min score: " + scores[0]);
        System.out.println("Max score: " + scores[scores.length - 1]);


        // copy Of method
        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 2);
        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbersTest = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(numbersTest));

        // copy of Range method
        char[] char1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] char2 = Arrays.copyOfRange(char1, 2, 3);
        System.out.println(Arrays.toString(char2));

        // for each loop practice intro
        int[] numbers2 = {10, 20, 30, 40, 50, 60, 70};
        for (int i = 0; i < numbers2.length; i++) {
            int eachNum = numbers2[i];
            System.out.println("eachNum = " + eachNum);
        }
        int numArray[] = numbers2;
        System.out.println(Arrays.toString(numArray));

        for (int eachNumber : numbers2) {
            System.out.println("eachNumber = " + eachNumber);
        }

        // print the first and last letter
        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};
        for (String eachWord : words) {
            System.out.println(eachWord.charAt(0) + "." + eachWord.charAt(eachWord.length() - 1));
        }
        System.out.println("---------------------------------------------");

        // print initials task 2
        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};
        for (String eachName : names) {
            System.out.println(eachName.charAt(0) + "." + eachName.charAt(eachName.indexOf(" ") + 1));
        }

        // items practice
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        //                   0         1           2         3        4           5

        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        //                   0        1       2       3        4         5

        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        //                   0        1       2       3       4        5

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemIDs[i];

            System.out.println(item + " - " + id + " - $" + price);
        }

        // find the max number

       /* int[] numbers3 = {10, 5, 4, 20, 1, 0};
        int max=numbers3[0];
        for (int i = 0; i < numbers3.length; i++) {
            if(numbers3[i]>max){
                max=numbers3[i];
            }
        }
        System.out.println("max = " + max);

        */
        int[] numbers4 = {10, 5, 4, 20, 1, 0};
        int max = numbers4[0];
        for (int eachNumber : numbers4) {
            if (eachNumber > max)
                max = eachNumber;
        }
        System.out.println("max = " + max);


        // put String into Array
        String str = "Java";
        char arr[] = str.toCharArray();
        System.out.println(Arrays.toString(arr));

        for (char each : arr) {
            System.out.print(each);
        }

        System.out.println("-------------------------------------");

        // split method
        String sentence = "Wooden Spoon";
        String[] arr2 = sentence.split("");
        System.out.println(Arrays.toString(arr2));

        String email = "WoodenSpoon@cydeo.com";
        String[] arr3 = email.split("@");
        System.out.println(Arrays.toString(arr3));


        System.out.println("-------------------------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String[] sentences = s.split("\\. ");

        System.out.println(Arrays.toString(sentences));


        // find the unique element
        String[] words2 = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (String each : words2) { // each: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"


        }
    }
}
