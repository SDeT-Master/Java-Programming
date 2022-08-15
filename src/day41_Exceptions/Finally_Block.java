package day41_Exceptions;

public class Finally_Block {

    public static void main(String[] args) {

        int[] arr={1,2,3};

        try{
            System.out.println(arr[9]);
        }catch (RuntimeException e){
            e.printStackTrace();

         //   System.exit(0);  we can terminate the finally by using System.exit(0);

        }

        finally {
            System.out.println("Finally block");
        }
    }
}
