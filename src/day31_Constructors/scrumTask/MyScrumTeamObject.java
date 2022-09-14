package day31_Constructors.scrumTask;

import java.util.Scanner;

public class MyScrumTeamObject {
    public static void main(String[] args) {

        Tester tester1= new Tester("Defne",1234,"SDET",120000);
        Tester tester2= new Tester("Alim",1235,"SDET",153000);
        Tester tester3= new Tester("Erkin",1236,"SE",126000);
        Tester tester4= new Tester("Christine",12,"SDET",110000);


        Tester[] testers={tester2,tester3,tester4};


        Developer developer1= new Developer("Vivian",321,"Java Developer",123000);
        Developer developer2= new Developer("Amina",311,"Java Master",163000);
        Developer developer3= new Developer("Enver",311,"Software Developer",10000);
        Developer developer4= new Developer("Christine",521,"Java Developer",93000);

        Developer[] developers={developer2,developer3,developer4};

        ScrumTeam scrum= new ScrumTeam("Alex","Hulya","Neira",14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);


        System.out.println("---------------------------------------");

        for(Tester eachTester : scrum.testerList){
            System.out.println(eachTester.name+" : "+eachTester.salary);
        }

        System.out.println("----------------------------");

        for (Developer eachDeveloper : scrum.developersList) {
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);

        }

        System.out.println("-------------------------------------");

        scrum.removeTester(12);
        scrum.removeDeveloper(311);
        System.out.println(scrum);


    }
}
