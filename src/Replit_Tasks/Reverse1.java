package Replit_Tasks;

public class Reverse1 {
    public static void main(String[] args) {
        String str="java is fun";
        String result="";

        for (int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
