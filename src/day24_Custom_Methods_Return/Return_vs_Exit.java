package day24_Custom_Methods_Return;

public class Return_vs_Exit {
    public static void main(String[] args) {
        nameOfMonth(50);
        System.out.println("Hello World");
    }



    public static void nameOfMonth(int num){

        if(num <1 || num >12){
            System.out.println("Invalid");
            return; // exits the method;  remaining code fragments of the method never gets executed;
          //  System.exit(0); // this exit method terminates everything that is in the console;
        }


        String name="";
        name= (num==1)?"Jan":(num==2)?"Feb":(num==3)?"March":(num==4)?"April":(num==5)?"May":(num==6)?"June"
                :(num==7)?"July" :(num==8)?"August":(num==9)?"September":(num==10)?"October"
                :(num==11)?"November":"December";

        System.out.println("name of month = " + name);

    }
}
