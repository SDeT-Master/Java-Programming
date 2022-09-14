package day16_ForLoopStringPractices;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo123School @3413143$#%@#%#@";


        String digits = "";
        String letters = "";
        String specialChars = "";


        for (int i = 0; i < str.length(); i++) {// i: index numbers of str
            char ch = str.charAt(i); // ch: every signle character that we have in str


            if (ch >= '0' && ch <= '9') { // if the character is between 0 to 9 then it is digit

                digits += ch;


            } else if (ch >= 'A' && ch <= 'Z') { // if the character is between a to z then it is letter


                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {// if the character is between a to z then it is letter
                letters += ch;

            } else {
                if (ch != ' ') {


                    specialChars += ch;  //if the character is neither digit nor letter. then it's special character;
                }

                System.out.println("specialChars = " + specialChars);
                System.out.println("letters = " + letters);
                System.out.println("digits = " + digits);
            }
        }
    }
}