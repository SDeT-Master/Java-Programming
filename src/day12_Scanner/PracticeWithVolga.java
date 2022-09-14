package day12_Scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class PracticeWithVolga {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("What is your name?");

       String name= input.nextLine();

       // String name=input;

        name=name.substring(name.indexOf('V')+name.indexOf('a')-1);

        System.out.println("Hello: "+name);



    }




}
