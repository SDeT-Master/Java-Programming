package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {


    public static void main(String[] args) {


        byte a=100;
        short b=a;
        int c=b;
        long d=c;
        float e =d;
        double f=e;


        System.out.println("\n");


        int x=55;

        short y=(short)x;


        System.out.println(x+" : "+y);



        long j=1_000_000l;

        byte k=(byte)j;

        System.out.println(j+":"+k);


        System.out.println("\n");


        double l=2.5;
        float m=(float)l;


        System.out.println(l+ ":"+m);



        double h=10.9;

        int n=(int)h;

        System.out.println(h+":"+n);


        System.out.println("\n");


        double d1=20.5;
        short s1= (short) d1;


        System.out.println(d1+":"+s1);



    }
}
