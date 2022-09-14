package Replit_Tasks;

import java.util.Arrays;

public class PrintFirstAndLast {
    public static void main(String[] args) {

                        //0        1       2
        String[]names={"James","Simon","Vivian"};
                    //  01234   01234   012345


        String tmp[]= new String[names.length];
        for (int i = 0; i < names.length; i++) {

          tmp[i]= names[i].substring(0,1) + names[i].substring(names[i].length()-1);

        }

        System.out.println(Arrays.toString(tmp));
        }
}
