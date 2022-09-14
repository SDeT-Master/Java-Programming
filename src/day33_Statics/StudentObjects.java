package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {


        Student student1=new Student("Don");
        System.out.println(student1);

        Student student2= new Student("Ali", 'F');
        System.out.println(student2);

        Student student3= new Student("Nigar",11);
        System.out.println(student3);

        Student student4= new Student("Melek", 321 ,'A');
        System.out.println(student4);

        Student student5= new Student("Cihad",'M',28);
        System.out.println(student5);

        Student student6= new Student("Sara",'F',27,111);
        System.out.println(student6);

        Student student7= new Student("Defne",'F',20,321,'A');
        System.out.println(student7);
        System.out.println("------------------------------------------------------");

        System.out.println(student1==student2);

        System.out.println("------------------------------------------------------");
        Student[] students={student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));










    }
}
