package day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        for (String eachWord : words) {
            int count=0;
            for (String element : words) {
                if(element.equals(eachWord)){
                    count++;
                }

                }
            if(count==1){
                System.out.println("eachWord = " + eachWord);
            }
        }

    }
}
