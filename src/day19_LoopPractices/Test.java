package day19_LoopPractices;

public class Test {
    public static void main(String[] args) {
        String str="abfdsafa";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            char ch=str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char ch2=str.charAt(j);
                if(ch==ch2){
                count++;
                }

            }
            if(result.contains(""+ch)){
                continue;
            }
            result+=ch;
            result+=count;
        }
        System.out.print(result);
    }
}
