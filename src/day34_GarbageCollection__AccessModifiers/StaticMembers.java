package day34_GarbageCollection__AccessModifiers;

public class StaticMembers { // outer class can not be static

    class class1{ // only inner classes can be static

    }




    public static int num=100;

    public static void method(){

    }

    static{

    }
}


class C{
static class A{
    static class B{
        public static void method(){

        }

    }
}}


class D{
    public static void main(String[] args) {
    }
}