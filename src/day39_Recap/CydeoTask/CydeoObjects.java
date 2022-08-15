package day39_Recap.CydeoTask;

import java.util.concurrent.TimeoutException;

public class CydeoObjects {
    public static void main(String[] args) {


        Developer developer=new Developer("Koray",18,'M',1,"Quality Assurance",125000);

        Tester tester= new Tester("Olga",18,'F',2,"SDET",110000);

        Teacher teacher= new Teacher("Daniel",29,'M',3,"Math Teacher",100000);

        Student student=new Student("Defne",19,'M',8,"Java SDET");


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("--------------");

        developer.setAge(40);
        System.out.println(developer);
        System.out.println(developer.getAge());

        System.out.println("--------------------");

        developer.work();
        tester.work();
        teacher.work();
       // student.work();


        System.out.println("---------------------------------------");


        developer.eat();
        developer.drink();
        developer.sleep();
        developer.fixingBugs();


        System.out.println("------------------------------");


        tester.eat();
        tester.drink();
        tester.sleep();

        tester.createTicket();


        System.out.println("------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();


      //  teacher.fixingBugs();

        System.out.println("--------------------------------");


        student.eat();
        student.drink();
        student.sleep();


       // student.fixingBugs


        student.study();




    }
}
