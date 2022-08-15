package day40_FinalKeyword;

public class Dog extends Animal{


        public Dog(String breed, char gender, String color, String size, int age) {
            super(breed, gender, color, size, age);
        }


        public void eat(){
            System.out.println(getName()+" is eating dog food");
        }

      /*  public void drink(){// final methods can not be overridden
            System.out.println(getName()+" is drinking beer");
        }

       */

        // final classes can not be inherited in Java;

        public void bark(){
            System.out.println(getName()+" is barking");
        }


    }

