package day31_Constructors;

public class BankAccountObjects {
    public static void main(String[] args) {

        BankAccount bankAccount1= new BankAccount();
        bankAccount1.setInfo("Ahmet Ozturk",1234456775);
        System.out.println(bankAccount1);

        bankAccount1.deposit(1000);
        bankAccount1.checkBalance();

        bankAccount1.withdraw(900);
        bankAccount1.checkBalance();

        System.out.println("--------------------------");

        BankAccount account2=new BankAccount();
        account2.setInfo("James Hun", 1234567890);
        System.out.println(account2);

        account2.deposit(10000); //instance means each object has its own copy
        account2.checkBalance();
    }
}
