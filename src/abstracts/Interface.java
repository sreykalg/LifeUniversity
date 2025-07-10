package abstracts;
interface IABCBank{
    void openAccount();
    void closeAccount();
}

interface IBankAccount{
    void deposit();
    void withdraw();
    void balance();
}

class Saving implements IBankAccount, IABCBank{

    @Override
    public void deposit(){
        System.out.println("Deposit in Saving Account");
    }

    @Override
    public void withdraw(){
        System.out.println("withdraw from Saving Account");
    }

    @Override
    public void balance(){
        System.out.println("balance in Saving Account");
    }

    @Override
    public void openAccount(){
        System.out.println("Open account in Saving Account");
    }
    @Override
    public void closeAccount(){
        System.out.println("Close Account in Saving Account");
    }
}
public class Interface {
    public static void main(String[] args){
        Saving saving = new Saving();
        saving.openAccount();
        saving.deposit();
        saving.withdraw();
        saving.balance();
        saving.closeAccount();
    }
}
