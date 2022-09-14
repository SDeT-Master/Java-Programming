package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {


        String str="aabddjccd";

        String result="";//j character that occurred only once


        for (int j = 0; j < str.length(); j++) { //


            char ch = str.charAt(j);
            int count = 0;    // represents the frequency of the variable

            for (int i = 0; i < str.length(); i++) {  // compares the character that out loop picked, with each character of the string
                char each = str.charAt(i);

                if (ch == each) {
                    count++;

                }

            }

            if(count==1){ // if the frequency of the character is 1, then the char is unique

                result+=ch;

            }


        }
        System.out.println("result = " + result);


    }
}
