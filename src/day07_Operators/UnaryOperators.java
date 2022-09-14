package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {


        int num1= 25;
        int num2=-25;


        System.out.println(num1<0); // false
        System.out.println(num2<0);// true


        System.out.println("\n");




        int a=5;

        ++a; // pre increment: increases the value by 1 immdiately


        System.out.println(a);


        --a; // decrement ; decreases the value by 1

        System.out.println(a);


        System.out.println("\n");


        int b =100;

        System.out.println(++b);  // post increment:




        int c=100;

        System.out.println(c++);

        System.out.println(c);   // post has two steps, first it doesnt increase the value, but it does in the second step


        System.out.println("\n");



        int x = 200;

        System.out.println(--x); // pre decrement

        System.out.println(++x);



        int y=200;

        System.out.println(y--); // post decrement

        System.out.println(y);


        System.out.println("\n");



        int z= 45;

        System.out.println(++z); // 46

        System.out.println(z++);  // post increment 47, but z is still going to print 46,

        System.out.println(z); // 47


        System.out.println("\n");

        int q= 30;


        System.out.println(--q); //29, q=29

        System.out.println(q--); // 29, q=28

        System.out.println(q);// 28
















    }
}
