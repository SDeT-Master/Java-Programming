package day35_Encapsulation;

public class  CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;


    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="Cydeo";
        programmingLanguage="JAVA";
        secretCode="Wooden Spoon";
    }

    public static void printProgrammingLanguage(){
        System.out.println("language is "+programmingLanguage);
    }

    public static void printSchoolName(){
        System.out.println("school name is "+schoolName);
    }

    public static void printSecretCode(){
        System.out.println("Code is "+secretCode);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                ", Code is='" + secretCode + '\'' +
                '}';
    }
}
