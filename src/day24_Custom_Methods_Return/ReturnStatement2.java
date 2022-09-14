package day24_Custom_Methods_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {
        nameOfMonth(3);
    }


    public static void nameOfMonth(int num){


        if(num <1 || num >12){
            System.out.println("Invalid");
            return; // exits the method;  remaining code fragments of the method never gets executed;
        }


        String name="";
            name= (num==1)?"Jan":(num==2)?"Feb":(num==3)?"March":(num==4)?"April":(num==5)?"May":(num==6)?"June"
                    :(num==7)?"July" :(num==8)?"August":(num==9)?"September":(num==10)?"October"
                    :(num==11)?"November":"December";

            System.out.println("name of month = " + name);

        }
}