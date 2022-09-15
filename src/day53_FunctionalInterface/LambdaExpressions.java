package day53_FunctionalInterface;

public class LambdaExpressions {

    public static void main(String[] args) {

        MyThirdFunctionalUserInterface<String> stringReverse;

        stringReverse=(s)->{
            String reverse=new StringBuilder(s).reverse().toString();

            return reverse;
        };

        System.out.println(stringReverse.method("Wooden Spoon"));

    }

}
