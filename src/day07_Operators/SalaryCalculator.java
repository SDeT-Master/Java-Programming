package day07_Operators;

public class SalaryCalculator {

    public static void main(String[] args) {






        int hourlyRate=89,weeklyHours=45;
        double stateTaxRate=6,federalTaxRate=20.9;
        int yearlySalary=hourlyRate*weeklyHours*52;




        System.out.println("Gross pay is $" + yearlySalary);

        double federalTax=yearlySalary*federalTaxRate/100;

        System.out.println("Federal tax is $" + federalTax);

        double stateTax=yearlySalary*stateTaxRate/100;
        System.out.println("State tax is $" + stateTax);

        double totalTax=stateTax+federalTax;
        System.out.println("totalTax is $ " + totalTax);

        double netIncome=yearlySalary-(federalTax+stateTax);

        System.out.println("netIncome $$$" + netIncome);




    }
}


/*3. Create a class called SalaryCalculator.java
3.1 declare the following variables:
hourlyRate, weeklyHours,
stateTaxRate, federalTaxRate
3.2 use the given info in above variables to
calculate the followings:
1. salaryBeforeTax
2. stateTax
3. federalTax
4. totalTax
5. salaryAfterTax
Hint: salaryBeforeTax =
hourlyRate * weeklyHour * 52
3.3 use print statement to print each of the
above
Ex:
   hourlyRate = $50
   weeklyHours = 45
   stateTaxRate = 6
(given as percentage, you need to convert to decimal)
   federalTaxRate = 26
(given as percentage, you need to convert to decimal)
    output:
    Gross pay is: $117000
    Federal tax is: $30420
    State tax is: $7020

 */