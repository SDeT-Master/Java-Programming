package Replit_Tasks;

public class ReturnMethods {
    public static void main(String[] args) {
      int total= sum(30,540)*3;
        System.out.println(total);


        String s1=reverse("Wooden Spoon");
        System.out.println(s1);


        System.out.println(isPalindrome("poop"));


    }

    public static int sum(int num, int num2){

        int result=num+num2;
      return result;

    }


    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
return result;

    }


    public static boolean isPalindrome(String str){
        String reversed=reverse(str);

        return reversed.equalsIgnoreCase(str);

    }






}
