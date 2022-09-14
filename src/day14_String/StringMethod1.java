package day14_String;

public class StringMethod1 {

    public static void main(String[] args) {


        String str1= "      batch 24        ";

        str1=str1.trim();

        System.out.println(str1);


        String str2 = "Cydeo School";

        int n1=str2.indexOf("h");

        int n2=str2.indexOf("ool");


        System.out.println(n1);
        System.out.println(n2);



        String str3= "Java Programming Language";
        int n3=str3.indexOf("an");
        System.out.println(n3);


        int n4 =str3.indexOf("ge");
        System.out.println(n4);



        int n5=str3.lastIndexOf("g");
        System.out.println(n5);



        String s= "Java Nova Cava Wawa orange";
        int firstA=s.indexOf("J");
        System.out.println("first a="+firstA);


        int lastA=s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA=s.indexOf("a ");
        System.out.println("secondA = " + secondA);



        int thirdA=s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);


        int forthA=s.indexOf("ava W");
        System.out.println("forthA = " + forthA);


        int fourthAf= s.lastIndexOf("av");
        System.out.println("fourthAf = " + fourthAf);


        int forthA2=s.lastIndexOf("Ca")+1;
        System.out.println("forthA2 = " + forthA2);



        int fifthA= s.lastIndexOf("va")+1;
        System.out.println("fifthA = " + fifthA);

// every solution has multiple tasks, always remember

        int sixthA=s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);


        int seventhA=s.lastIndexOf("a o");
        System.out.println("seventhA = " + seventhA);




    }
}

