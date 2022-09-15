package day53_FunctionalInterface;

@FunctionalInterface
public interface MyThirdFunctionalUserInterface<T> {

   abstract T method(T data);

   // abstract keyword is given automatically



}


/*
2. Create a Functional interface named MyThirdFunctionalInterface that has an abstract method takes
one argument of any type and returns the same type
 */