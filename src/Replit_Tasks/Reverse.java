package Replit_Tasks;

public class Reverse {
    public static void main(String[] args) {

        String name="hi dear";
        String reverse="";

        for (int i =name.length()-1; i >=0; i--) {
            reverse+=name.charAt(i);
        }
        System.out.println(reverse);
    }
}
