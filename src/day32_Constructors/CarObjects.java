package day32_Constructors;

public class CarObjects {
    public static void main(String[] args) {


        // Having multiple Constructors ,it allows you to give/pass multiple options as given below;


        Car car1= new Car("Toyota");

        Car car2= new Car("Honda","Accord");

        Car car3= new Car("Lexus","RX34",2022);

        Car car4= new Car("BMW","X6",2022,34999);

        Car car5= new Car("Tesla","Model3",2022,80000,"Green");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);





    }
}
