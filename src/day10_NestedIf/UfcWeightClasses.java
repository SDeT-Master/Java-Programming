package day10_NestedIf;

public class UfcWeightClasses {

    public static void main(String[] args) {


        int weight=15;

        if(weight>=105 && weight<=265) {
            if (weight >= 106 && weight<=115) {
                System.out.println("Strawweight");}

            else if (weight >= 115 && weight<=125) {
                System.out.println("Flyweight");
            }

            else if (weight >= 125 && weight<=135) {
                System.out.println("Bantamweight");}


             else if (weight >= 135 && weight <=145){
                System.out.println("Featherweight");
            }

             else if (weight >= 145 && weight <=155) {
                System.out.println("Lightweight");
            }

             else if (weight >= 155 && weight <= 170) {
                System.out.println("Welterweight");
            }

             else if (weight >= 170 && weight <= 185) {
                System.out.println("Middleweight");
            }

             else if(weight>=185 && weight <=205) {
            System.out.println("Light heavyweight");

        }
        else{

                System.out.println("Heavyweight");
        }

    }else{ System.out.println("You are not eligible to fight with your current weight!!!");



        }



    }

}


