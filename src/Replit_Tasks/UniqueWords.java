package Replit_Tasks;

import java.util.Scanner;

public class UniqueWords {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        uniqueNum(scan.nextInt());
    }
    public static void uniqueNum(int num){


        int unique=0;
        for (int i = 0; i < num; i++) {
            unique+=i;
            for (int j = 0; j < unique; j++) {
                if(unique==1){
                    System.out.println(unique);
            }
            }
        }

    }





}
