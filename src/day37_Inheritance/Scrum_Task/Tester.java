package day37_Inheritance.Scrum_Task;

public class Tester extends Employee{ // Tester IS A employee, Tester IS A person as well

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void ticket(){
        System.out.println(jobTitle+" "+ name+ " is creating ticket");
    }


}
