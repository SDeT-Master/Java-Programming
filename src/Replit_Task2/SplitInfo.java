package Replit_Task2;

public class SplitInfo {
    public static void main(String[] args) {

        String str=("jon,doe,30");

        String[] result=str.split(",");

        System.out.println("person name: "+result[0]);
        System.out.println("last name: "+result[1]);
        System.out.println("age: "+result[2]);




    }
}
