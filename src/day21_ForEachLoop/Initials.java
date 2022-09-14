package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[]  names= {"Elif John","Erkin Kablu","James Hu","Dan Lame","Hool Back","Nick Mouse","Shauna Hopper"};

        for(String each :names){
            String initials= each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);

            System.out.println(initials);

        }

    }
}
