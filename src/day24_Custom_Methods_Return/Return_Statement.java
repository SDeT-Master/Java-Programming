package day24_Custom_Methods_Return;

public class Return_Statement {
    public static void main(String[] args) {
        nameOfDay(10);
    }



    public static void nameOfDay(int num){

        if(num<=1 || num>=7){ // if the number is in valid
            System.out.println("Invalid");
            return; // exits nameOfDay method
        }

        if (num==1){
            System.out.println("Monday");
        } else if(num==2){
            System.out.println("Tuesday");
        } else if(num==3){
            System.out.println("Wednesday");
        } else if(num==4){
            System.out.println("Thursday");
        } else if (num==5){
            System.out.println("Friday");
        } else if(num==6){
            System.out.println("Saturday");
        } else{
            System.out.println("Sunday");
        }


    }


}
