package day16_ForLoopStringPractices;

public class RemoveDuplicatedChars {
    public static void main(String[] args) {
        
        String input="AABBCCBC";
        String chars="";
        String result="";

        for (int i = 0; i < input.length() ; i++) {
             chars=""+input.charAt(i);
            if(!result.contains(chars)) {
                result+=chars;
            }
        }
        System.out.println(result);
    }
}
/*2. Write a program that can remove the duplicated characters from a 
String
Ex:
input:
AABBCCBC
Output:
ABC

 */