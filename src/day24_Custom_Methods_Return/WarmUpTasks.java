package day24_Custom_Methods_Return;

public class WarmUpTasks {


    public static void main(String[] args) {
        initials("hello","world");   // H.S
        domain("simon.sayimu@gmail.com"); // returns domain name
        nameOfMonth(12);
        nameOfDay(7);

    }

    public static void initials(String firstName, String lastName){
        String initial=firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();
        System.out.println("initial = " + initial);


    }

    public static void domain(String email){
        String domain=email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    public static void nameOfMonth(int num){
        String name="";
        if(num>=1 && num <=12){

            name= (num==1)?"Jan":(num==2)?"Feb":(num==3)?"March":(num==4)?"April":(num==5)?"May":(num==6)?"June"
                    :(num==7)?"July" :(num==8)?"August":(num==9)?"September":(num==10)?"October"
                    :(num==11)?"November":"December";

        }else{
            name="invalid";
        }
        System.out.println("month = " + name);

    }


    public static void nameOfDay(int num){
        String day="";

        if(num>=1 && num<=12){

            day=(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday"
                    :(num==5)?"Friday":(num==6)?"Saturday":"Sunday";
        } else{
            day="Invalid day";
        }
        System.out.println("day = " + day);
    }






}
