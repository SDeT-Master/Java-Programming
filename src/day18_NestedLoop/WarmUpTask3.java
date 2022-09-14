package day18_NestedLoop;

public class WarmUpTask3 {
    public static void main(String[] args) {
      String str="*";
      int count=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                count++;
                System.out.print(str+" ");
            }
            System.out.println();
        }
        System.out.println("Number of asterisks are: "+count);
    }
}
/*
1. Print the following shape by using a nested Loop:
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
 */