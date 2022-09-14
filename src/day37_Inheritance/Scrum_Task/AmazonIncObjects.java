package day37_Inheritance.Scrum_Task;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AmazonIncObjects {
    public static void main(String[] args) {

        String company="Amazon Inc";
        ProductOwner po=new ProductOwner("Defne",18,'F',1,120000,company);


        BusinessAnalyst ba=new BusinessAnalyst("Christine",20,'F',12,150000,company);


        ScrumMaster sm=new ScrumMaster("Bella",19,'F',123,134000,company);


        Tester tester1=new Tester("Rabia",25,'F',"QA",1235,86000,company);
        Tester tester2=new Tester("Bella",21,'F',"Sdet",1232,186000,company);
        Tester tester3=new Tester("Dan",25,'M',"QA",235,56000,company);
        Tester tester4=new Tester("Rose",19,'F',"Sdet",123599,286000,company);

        Tester[]testers={tester1,tester2,tester3,tester4};


        Developer developer1= new Developer("Vivian", 20,'F',"Java Developer",122,150000,company);
        Developer developer2= new Developer("Olivia", 18,'F',"Java Engineer",12,140000,company);
        Developer developer3= new Developer("Chloe", 19,'F',"Java Constructor",162,100000,company);
        Developer developer4= new Developer("Zeynep", 38,'F',"Java Developer",102,920000,company);
        Developer developer5= new Developer("Derya", 18,'F',"Java Developer",22,180000,company);

        Developer[] developers={developer1,developer2,developer3,developer4,developer5};


        ScrumTeam scrumTeam= new ScrumTeam(po,ba,sm);
        scrumTeam.addDevelopers(developers);
        scrumTeam.addTesters(testers);



        System.out.println(scrumTeam);
        System.out.println("--------------");


        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+" : "+"$"+tester.salary);

        }

        System.out.println("--------------------------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name+" : "+"$"+developer.salary);

        }



    }
}
