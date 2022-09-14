package day37_Inheritance.phone_Task;

public class PhoneShop$Objects {
    public static void main(String[] args) {

        iPhone iPhone1= new iPhone("Iphone12","6.2 inches",1000,"Black");

        Samsung samsung1= new Samsung("galaxy S19","6inches",800,"White");

        Nokia nokia1=new Nokia("Brick","4 inches",50,"Grey");


        System.out.println(iPhone1);
        System.out.println(samsung1);
        System.out.println(nokia1);

        iPhone1.call(911);
        iPhone1.text(1234);
        iPhone1.faceTime(123);
        iPhone1.faceTime("yahoo@gmail.com");

        System.out.println("---------------");
        samsung1.call(123);
        samsung1.text(12344);
        samsung1.freeze();

        System.out.println("-------------");

        nokia1.call(13431);
        nokia1.text(32532);
        nokia1.selfDefence();

        System.out.println("-------------------------------------------");


        System.out.println(Phone.hasBattery);
        System.out.println(iPhone1.hasBattery);
        System.out.println(samsung1.hasBattery);
        System.out.println(nokia1.hasBattery);


    }

}
