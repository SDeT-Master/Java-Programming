package day38_Inheritance.CarTask.CarTask;

public class BMW extends Car {


    public BMW(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);

    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" is breaking down");
    }

    public void racing(){
        System.out.println(brand+" "+model+" is a racing car");
    }

}
