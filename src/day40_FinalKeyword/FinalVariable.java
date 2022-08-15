package day40_FinalKeyword;

public class FinalVariable {


    final String bDay;

   final static String name;
  static {
      name="Batch 25";
  }

    public FinalVariable(String bDay) {
        this.bDay = bDay;
    }


    public static void main(String[] args) {

        final char gender;

        final String birthDay;

       final double pi=3.14;

       // pi=4.4; final variables can not be re-assigned

        final String name;
        name="Java";

       //  name= "Wooden Spoon"; with using final keyword you can assign it only once


        System.out.println("-----------------------");



        FinalVariable obj= new FinalVariable("May 1st");
        System.out.println(obj.bDay);

        System.out.println(FinalVariable.name);



    }
}
