package day34_GarbageCollection__AccessModifiers;

public class Constructor_vs_Statics {
    static {
        System.out.println("Static block");
    }

    public  Constructor_vs_Statics(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new Constructor_vs_Statics();
        new Constructor_vs_Statics();
        new Constructor_vs_Statics();
        new Constructor_vs_Statics();
        new Constructor_vs_Statics();



    }

}
