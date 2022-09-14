package Replit_Tasks;

import java.util.Scanner;

public class ign {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        sign(scan.nextInt());
    }

    public static void sign(int num1){

        if(num1>0){
            System.out.println("positive");
        } else if(num1==0){
            System.out.println("zero");
        }else{
            System.out.println("negative");
        }
    }



}
