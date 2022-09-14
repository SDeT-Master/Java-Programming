package Replit_Tasks;

import java.util.Arrays;

public class SplitPerson {
    public static void main(String[] args) {
        String person = "jon,doe,30";



        String[] result = person.split(",");
        for (String each : result) {



            System.out.println(each);
        }
    }
}
