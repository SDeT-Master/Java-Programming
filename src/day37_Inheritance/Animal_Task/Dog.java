package day37_Inheritance.Animal_Task;

public class Dog extends Animal {



    public Dog(String name, String breed, char gender, int age, String size, String color){
           super(name, breed, gender, age, size, color);


    }
    public void bakr(){
        System.out.println(name+ " is barking");
    }

}

