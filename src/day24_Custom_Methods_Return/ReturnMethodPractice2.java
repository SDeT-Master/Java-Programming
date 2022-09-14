package day24_Custom_Methods_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {

        String str=grade(100);

        if(str.equals("A")){
            System.out.println("Excellent");
        }else if(str.equals("B"))
        {
            System.out.println("Great");
        } else if(str.equals("C")){
            System.out.println("Good");
        } else if(str.equals("D")){
            System.out.println("Passed");
        } else{
            System.out.println("Try again");
        }

    }


    // create a function that can calculate the grade;


    // check the grade : if A print Excellent, if B print Great


    public static String grade(int score) {

        String result = "";

        if (score < 0 || score > 100) {
            System.out.println("Invalid");

        } else {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D"
                    : "F";
        }
            return  result; // the purpose is to re use 'grade'
    }





}
