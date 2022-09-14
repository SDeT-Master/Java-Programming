package Replit_Tasks;

public class PrintShortestWord {

    public static void main(String[] args) {

        String[] words={"a","abc","ab"};

        int min=0;

        for (int i = 0; i < words.length; i++) {

            if(words[i].length()<words[min].length()){
                min=i;
            }
        }
        System.out.println(words[min]);
    }

}
