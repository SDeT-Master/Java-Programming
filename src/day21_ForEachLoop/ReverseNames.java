package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[]  names= {"Elif John","Erkin Kablu","James Hu","Dan Lame","Hool Back","Nick Mouse","Shauna Hopper"};

        for(String each:names){ // each represents every single character
            String reversed="";


            for (int i = each.length()-1; i>=0 ; i--) {
               reversed += each.charAt(i);

            }

            System.out.println(reversed);

        }



    }
}
