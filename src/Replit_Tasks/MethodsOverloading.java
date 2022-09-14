package Replit_Tasks;

public class MethodsOverloading {
    public static void main(String[] args) {
       int r1= sum(10,40);
        System.out.println(r1);

        int r2=sum(40,3,5,2);
        System.out.println(r2);
    }


    public static int sum(int a, int b){

        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int sum(int a, int b, int c, int d){
        return  sum(a,b,c)+d;
    }


}
