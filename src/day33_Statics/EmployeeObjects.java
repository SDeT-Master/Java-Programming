package day33_Statics;

import day19_LoopPractices.ExitMethod;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1= new Employee();
        employee1.name="Ahmed";
        employee1.salary=90000;


        Employee employee2= new Employee();
        employee2.name="Aygun";
        employee2.salary=98000;


        Employee employee3=new Employee();
        employee3.name="Fady";
        employee3.salary=120000;


        System.out.println(employee1.name+" : "+employee1.salary);
        System.out.println(employee2.name+" : "+employee2.salary);
        System.out.println(employee3.name+" : "+employee3.salary);


        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);






    }
}
