package day10_NestedIf;

public class BiggerNumber {

    public static void main(String[] args) {

        int n1 = 11, n2 = 20, n3 = 322;

        String result = (n1 > n2) ? "n1 is the biggest number" : (n2 > n3) ?
                "n2 is the biggest number" : "n3 is the biggest number";

        System.out.println(result);


    }
}

      /*  if(n1>n2){
            result="n1 is the biggest number";
        }

        else if (n2>n3){
            result="n2 is the biggest number";
        }else{
            result="n3 is the biggest number";

        }
        System.out.println(result);

    }
}


5. Create a class called BiggerNum, write a program that checks for the
bigger of 3 numbers.
you get 3 int variables with DIFFERENT values: n1 , n2 and n3
if n1 is biggest output: "n1 is bigger"
if n2 is biggest output: "n2 is bigger"
if n3 is biggest output: "n3 is bigger"
NOTE: MUST USE TERNARY

       */


