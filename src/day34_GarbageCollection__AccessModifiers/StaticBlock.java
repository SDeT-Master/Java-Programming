package day34_GarbageCollection__AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method");
    }

    // first thing that gets executed is static block; // and it runs only one time

    static{
        System.out.println("Static block 1");
    }

    static{
        System.out.println("Static block 2");
    }

    static{
        System.out.println("Static block 3");
    }


}
