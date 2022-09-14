package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n=2;


        if(n%2==0){

            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


        System.out.println("------------------------------------------------------");

       String result1= (n%2==0)?"Even": "Odd";
        System.out.println(result1);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");




        int age=23;

        if(age>=23){
            System.out.println("Eligible to buy alcohol");

        }else{
            System.out.println("Not eligible");
        }


        System.out.println("========================================================");

      String result=  (age>=23)?"Eligible":"Not eligible";


        System.out.println(  (age>=18)?"Eligible":"Not Eligible");


        System.out.println("-----------------------");


        int number=0;

        String result2=(number>0)?"Positive":(number<0)?"Negative":"Zero";
        System.out.println(result2);

    }
}
