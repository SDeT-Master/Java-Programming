package Unit_Test;

public class publicClass {
    public static void main(String[] args) {

      dosum(10,20);
      dosum(10.0,20.0);



    }


    public static void dosum(double x,double y){
        System.out.println("double sum us"+(x+y));
    }
    public static void dosum(float x,float y){
        System.out.println("f sum us"+(x+y));
    }
    public static void dosum(int x,int y){
        System.out.println("int sum us"+(x+y));
    }



}
