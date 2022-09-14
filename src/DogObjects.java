import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {
        day30_CustomClass.Dog dog1= new day30_CustomClass.Dog();
        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size="Small";
        dog1.color="White";



        day30_CustomClass.Dog dog2= new day30_CustomClass.Dog();
        dog2.name="Ace";
        dog2.breed="Husky";
        dog2.age=5;
        dog2.gender='M';
        dog2.size="Large";
        dog2.color="Black & White";


        day30_CustomClass.Dog dog3= new day30_CustomClass.Dog();
        dog3.setInfo("Jack","GermanShephard",
                5,'F',"Big","White");


        dog1.eat();
        dog2.bark();

        day30_CustomClass.Dog dog4=new day30_CustomClass.Dog();
        dog4.setInfo("Simon","Pit-Bull",5,'M',"Large","Yellow");

        day30_CustomClass.Dog dog5= new day30_CustomClass.Dog();
        dog5.setInfo("Bull","Labrador",10,'F',"Small","Golden");

        System.out.println("---------------------------------------------");


        day30_CustomClass.Dog[] dogs={dog1,dog2,dog3,dog4,dog5};

        ArrayList<day30_CustomClass.Dog> femaleDogs= new ArrayList<>();
        ArrayList<day30_CustomClass.Dog> maleDogs= new ArrayList<>();




    }

}


class Dog{


    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;
    }

    // if u give static keyword it means there will be only one keyword;

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void bark(){
        System.out.println(name+"  is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}