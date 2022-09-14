package day37_Inheritance.Animal_Task;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1= new Dog("Alex","Husky",'M',2,"Big","White");
        System.out.println(dog1);

        Cat cat1=new Cat("Cat","Turkish",'M',3,"Small","Grey");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1=new Parrot("King","Macaw",'F',1,"Small","Colorful");
        System.out.println(parrot1);
        parrot1.sing();



    }
}
