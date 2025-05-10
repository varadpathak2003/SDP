// Product Interfaces
interface SavingsAccount {
    void calculateBalance(int balance);
}
interface CurrentAccount {
    void calculateBalance(int balance);
}
// India-specific Accounts
class IndiaSavingsAccount implements SavingsAccount {
    public void calculateBalance(int balance) {
        float interest = balance * 0.06f; // 6% interest
        System.out.println("India Savings Balance: " + (balance + interest));
    }
}
class IndiaCurrentAccount implements CurrentAccount {
    public void calculateBalance(int balance) {
        float fee = balance * 0.02f; // 2% maintenance fee
        System.out.println("India Current Balance: " + (balance - fee));
    }
}

// Canada-specific Accounts
class CanadaSavingsAccount implements SavingsAccount {
    public void calculateBalance(int balance) {
        float interest = balance * 0.04f; // 4% interest
        System.out.println("Canada Savings Balance: " + (balance + interest));
    }
}

class CanadaCurrentAccount implements CurrentAccount {
    public void calculateBalance(int balance) {
        float fee = balance * 0.015f; // 1.5% maintenance fee
        System.out.println("Canada Current Balance: " + (balance - fee));
    }
}
// Abstract Factory
interface BankAccountFactory {
    SavingsAccount createSavingsAccount();
    CurrentAccount createCurrentAccount();
}

class IndiaBankAccountFactory implements BankAccountFactory {
    public SavingsAccount createSavingsAccount() {
        return new IndiaSavingsAccount();
    }
    public CurrentAccount createCurrentAccount() {
        return new IndiaCurrentAccount();
    }
}

// Canada Factory
class CanadaBankAccountFactory implements BankAccountFactory {
    public SavingsAccount createSavingsAccount() {
        return new CanadaSavingsAccount();
    }
    public CurrentAccount createCurrentAccount() {
        return new CanadaCurrentAccount();
    }
}
// Client Code
public class Main {
    public static void main(String[] args) {
        BankAccountFactory indiaFactory = new IndiaBankAccountFactory();
        SavingsAccount indiaSavings = indiaFactory.createSavingsAccount();
        CurrentAccount indiaCurrent = indiaFactory.createCurrentAccount();
        
        indiaSavings.calculateBalance(10000);
        indiaCurrent.calculateBalance(10000);
        
        BankAccountFactory canadaFactory = new CanadaBankAccountFactory();
        SavingsAccount canadaSavings = canadaFactory.createSavingsAccount();
        CurrentAccount canadaCurrent = canadaFactory.createCurrentAccount();
        
        canadaSavings.calculateBalance(10000);
        canadaCurrent.calculateBalance(10000);
    }
}
