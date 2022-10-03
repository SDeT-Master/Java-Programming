package day22_Multi_Dimensional_Arrays;

public class ReverseSentencePractice {
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";
        String arr[]=sentence.split(" ");
        String reversedSentence="";
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedSentence+=arr[i]+" ";
        }

        System.out.println("reversedSentence = " + reversedSentence);


    }
}
