package day43_Abstraction.employee;

import day01_JavaIntro.Test;

public class EmployeeObjects {
    public static void main(String[] args) {
       // You can not create objects from  Abstract classes

        Driver driver=new Driver("Defne",19,'F',123,"SDET",120000);
        Developer developer=new Developer("Dorian",24,'M',321,"Developer",135000);
        Teacher teacher=new Teacher("Vivian",20,'F',234,"Teacher",87000);
        Tester tester= new Tester("Christine",27,'F',432,"Tester",90000);


        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("--------------");

        developer.work();
        developer.sleep();
        developer.unitTest();
       // developer.bugReport();
        developer.eat();

        System.out.println("--------------------------");



        // teacher.unitTest();
        // teacher.bugReport();
        teacher.eat();
        teacher.work();
        teacher.sleep();
        

    }
}
