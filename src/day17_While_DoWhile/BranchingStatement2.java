package day17_While_DoWhile;

public class BranchingStatement2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {

            if(i=='C'){
                continue; // skips C
            }

            System.out.println(i);

        }


        System.out.println("------------------------------");

        // print all even numbers from 1=10;

        for (int i = 0; i <=10 ; i++) {
            if(i%2 !=0){  // 1, 3, 5, 7, 9
               continue; // skip
            }
            System.out.println(i);
        }


        System.out.println("---------------");
        // print all odd numbers from 1-10;

        for (int i = 0; i <=10 ; i++) {
            if((i%2==0)){ // it is going to skip 2,4,8,10
                continue; // it is used for skipping the current iteration
            }
            System.out.println(i);

        }
    }
}
