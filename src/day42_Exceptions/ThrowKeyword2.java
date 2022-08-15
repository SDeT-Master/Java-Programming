package day42_Exceptions;

import day04_Variables.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    // we use throw keyword to create exceptions

    public static void main(String[] args) {

        throw new NoSuchElementException("There is no such element as break");

        //throw new InterruptedException();

       // System.out.println("Hello world");
    }
}
