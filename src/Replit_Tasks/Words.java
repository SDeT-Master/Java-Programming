package Replit_Tasks;

public class Words {
    public static void main(String[] args) {
        String[] words={"hello", "why", "by", "apple" , "note"};

        String result="";

        for (String word : words) {
            for (int i = 0; i < words.length; i++) {
                result=word.substring(0,1)+word.substring(word.length()-1);
            }
            System.out.println(result);
        }


    }
}
