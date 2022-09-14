package day36_Inheritance.Animal_Task;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","White");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Rocky","Turkish",'M',3,"Big","Grey");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.meow();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger= new Tiger();
        tiger.setInfo("SherKhan","Bengal",'M',4,"Large","Red");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();
        tiger.hunt();
        System.out.println(tiger);

    }
}
