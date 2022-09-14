package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

      int a=50; // a=30-7= 23 , 23-7=16. 16-7=9, 9-7=2;
      int b=7;

      int count=0;  // count 1,  count 2, count 3, count 4;

      while(a>=b){
          a-=b;
          count++;

      }


        System.out.println(count+" with a remainder of "+a);



    }
}
