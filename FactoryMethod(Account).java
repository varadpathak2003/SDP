interface Account {
    void balance(int balance,int Rate);
}

class SavingsAccount implements Account {
    @Override
    public void balance(int balance,int interestRate) {
        float interest=balance*interestRate/100;
        System.out.println("Balance Of Savings Account With Interest : "+(balance+interest));
    }
}
class CurrentAccount implements  Account{
    @Override
    public void balance(int balance,int maintenanceRate) {
        float maintenance=balance*maintenanceRate/100;
        System.out.println("Balance Of Current Account after Maintenance charges  : "+(balance-maintenance));
    }
}
interface Factory{
    public Account createAccount();
}

class SavingsFactory implements Factory{
    public Account createAccount(){
        return new SavingsAccount();
    }
}
class CurrentFactory implements Factory{
    public Account createAccount(){
        return new CurrentAccount();
    }
}

public class Main {
    public static void main(String[] args) {
        Factory sFactory = new SavingsFactory();
        Account savings=sFactory.createAccount();
        savings.balance(10000,10);
        
        Factory cFactory = new CurrentFactory();
        Account current=cFactory.createAccount();
        current.balance(10000,1);
        
    }
}
