package day13_StringClass;

public class Initials2 {
    public static void main(String[] args) {
        String firstName="Wooden";
        String lastName="Spoon";

        char first=firstName.charAt(0);
        char last=lastName.charAt(0);
        String result=first+"."+last;// turning char into string with double quote

        System.out.println(result);
    }
}

/*
Task:
initial:
firstName = "Wooden";
lastName = "Spoon";
output:
W.S
 */