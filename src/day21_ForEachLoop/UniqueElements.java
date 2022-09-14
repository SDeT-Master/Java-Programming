package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words={"Elif","Erkin","James","Dan","Hool","Nick","Shauna","Shauna","Nick","Elif","Erkin"};


        for (String i : words) { // each stands for every single element/word that we have in the Array
            int count=0;


            for (String each1 : words) {

                if(each1.equals(i)){
                    count++;
                }
            }

            if(count==1){
                System.out.println(i);

            }

        }






    }
}
