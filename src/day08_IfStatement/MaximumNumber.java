package day08_IfStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        int n1=200, n2=200;

        boolean n1isMaxNum=n1>n2;
        boolean n2isMaxNum=n1<n2;
        boolean isEqual=n1==n2;


        if (n1isMaxNum){

            System.out.println(n1+" is the maximum number");
        }

if(n2isMaxNum){

    System.out.println(n2+ " is the maximum number");

}


if (isEqual){

    System.out.println(n1+" and "+ n2+ " are equal");
}




    }
}

/*3. Write a program that can print the maximum number between two
numbers, if both are equal then print Equal
Ex:
n1= 100, n2 = 200;
output:
200 is maximum number

 */