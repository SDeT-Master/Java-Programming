package day27_WrapperClasses;

import jdk.swing.interop.SwingInterOpUtils;
import utilities.StringUtility;

public class WrapperClassMethods {
    public static void main(String[] args) {


        String str="123";

        int num=Integer.parseInt(str); // return type is now int
        System.out.println(num+1);// 124

        System.out.println(str+1); // 1231


        String str2= "10.5";
        double num2=Double.parseDouble(str2); // returns double
        System.out.println(num2+1); // 11.5, because it is treated as a primitive data type, number
        System.out.println(str2+1);// 11.51 , becase here it is treated as a txt

        System.out.println("---------------");

       int max= Integer.MAX_VALUE;
      int min= Integer.MIN_VALUE;

        System.out.println("max: "+max);
        System.out.println("min: "+min);


      long maxLong=  Long.MAX_VALUE;
      long minLong=Long.MIN_VALUE;
        System.out.println("minLong = " + minLong);
        System.out.println("maxLong = " + maxLong);


        String s1="maybe";
       boolean r1= Boolean.parseBoolean(s1);
        System.out.println(r1);
        System.out.println("-----");




        // valueOf: converts String to wrapper class
        String s2="123";
       Integer x= Integer.valueOf(s2);
       int y=Integer.valueOf(s2);
        System.out.println(x);
        System.out.println(y);

        // parse returns primitive at the end
        // valueOf returns wrapper at the end


        System.out.println("------------------");
        // isDigit
        char ch1='0';
        char ch2='9';
        char ch3='@';
        char ch4='A';
        char ch5='B';
        boolean r2=Character.isDigit(ch1);
        boolean r3=Character.isLetter(ch2);
        boolean r4=!Character.isLetterOrDigit(ch3);
        boolean r5=Character.isLowerCase(ch4);
        boolean r6= Character.isUpperCase(ch5);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);


        System.out.println("--------------");

        String s= "ab123abcdjfkdsajklj343";
        int sum=0;
        for (char each : s.toCharArray()) {

            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);

            }

        }

        System.out.println(sum);




    }



}
