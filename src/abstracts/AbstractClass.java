package abstracts;

import java.lang.classfile.CustomAttribute;

abstract class ABABank{
    abstract void openAccount();
    abstract void closeAccount();

}

abstract class BankAccount extends ABABank{
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();
}

class SavingAccount extends BankAccount{
    @Override
    void deposit(){
        System.out.println("Deposit in Saving Account");
    }

    @Override
    void withdraw(){
        System.out.println("Withdraw from Saving Account");


    }

    @Override
    void balance(){
        System.out.println("balance in Saving Account");

    }

    @Override
    void openAccount() {
        System.out.println("Open Account");
    }

    @Override
    void closeAccount() {
        System.out.println("Close Account");
    }
}

class CurrentAccount extends BankAccount{
    @Override
    void deposit(){
        System.out.println("Deposit in current Account");
    }

    @Override
    void withdraw(){
        System.out.println("Withdraw from current Account");


    }

    @Override
    void balance(){
        System.out.println("balance in current Account");

    }
    @Override
    void openAccount() {
        System.out.println("Open Account");
    }

    @Override
    void closeAccount() {
        System.out.println("Close Account");
    }
}
public class AbstractClass {
    public static void main(String[] args){
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.openAccount();
        savingAccount.deposit();
        savingAccount.withdraw();
        savingAccount.balance();
        savingAccount.closeAccount();

        CurrentAccount currentAccount = new CurrentAccount();
        savingAccount.openAccount();
        currentAccount.deposit();
        currentAccount.withdraw();
        currentAccount.balance();
        savingAccount.closeAccount();
    }
}
