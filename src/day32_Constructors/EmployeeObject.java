package day32_Constructors;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1= new Employee("Jason");
        System.out.println(employee1);


        Employee employee2= new Employee("Defne",'F');
        System.out.println(employee2);


        Employee employee3= new Employee("Dan",'M',"SDET");
        System.out.println(employee3);

        Employee employee4= new Employee("Vivian",'F', "President",1212122);
        System.out.println(employee4);

    }
}
