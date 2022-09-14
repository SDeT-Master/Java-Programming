package utilities;

import day34_GarbageCollection__AccessModifiers.AccessModifiers;

public class AccessModifiersTEST {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
      //  System.out.println(AccessModifiers.defaultData);// Default is not visible outside the package
       // System.out.println(AccessModifiers.privateData);// Private is not visible outside the class

        AccessModifiers.method1();
     //   AccessModifiers.method2();
       // AccessModifiers.method3();

    }
}
