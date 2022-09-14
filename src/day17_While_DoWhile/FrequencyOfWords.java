package day17_While_DoWhile;

public class FrequencyOfWords {

    public static void main(String[] args) {


        String str = "JavaJavaJava";

        int frequency = 0; // temp variable


        //  8-4
        for (int i = 0; i < str.length() - 3; i++) {  // i: 1,2,3,4,5,6,7

            String eachSub = str.substring(i, i + 4);
            {


                //System.out.println("eachSub = " + eachSub);

                if (eachSub.equals("Java")) ;
                {

                    frequency++;

                }

            }


            System.out.println("frequency = " + frequency);
        }


    }
}