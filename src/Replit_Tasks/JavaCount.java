package Replit_Tasks;

public class JavaCount {
    public static void main(String[] args) {

        String input ="jjjjfdsa is fjdskajfklsaj is is is fjdksajfkldsajfkdsjisisisis IS";
        input=input.toLowerCase();
        int count=0;

        while(input.contains("is")){
            input=input.replaceFirst("is","");
            count++;
        }
        System.out.println("count = " + count);
    }
}
