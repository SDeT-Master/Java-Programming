package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {

        Person person1= new Person();
      //  person1.name="Daniel";
     //   person1.age=28;

        person1.setName("Daniel");
        person1.setAge(150);


       // System.out.println(person1.name);

        System.out.println(person1.getName()+" : "+person1.getAge());





    }
}
