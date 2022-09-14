package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1= new Student();
        student1.setInfo("James",'F',39,2939,'C');
        System.out.println(student1);

        Student student2= new Student();
        student2.setInfo("Hulya",'F',30,39348,'B');

        Student student3=new Student();
        student3.setInfo("Jason",'M',30,39333,'C');

        Student student4= new Student();
        student4.setInfo("Vivian",'F',12,928,'A');

        Student student5= new Student();
        student5.setInfo("Christine",'F',20,49348,'B');


        Student[] students={student1,student2,student3,student4,student5};
        for (Student each : students) {
            System.out.println(students);


        }

        System.out.println("------------------------");

        ArrayList<Student> earlyBirds= new ArrayList<>();
        ArrayList<Student> angryBirds= new ArrayList<>();

        for (Student student : students) {
            if(student.grade=='A'){
                earlyBirds.add(student);
            } else{
                angryBirds.add(student);
            }

        }

        System.out.println("earlyBirds = " + earlyBirds+" ");
        System.out.println("angryBirds = " + angryBirds+" ");
    }
}
