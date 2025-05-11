//interface
interface PaymentProcessor{
    public void processPayment();
}
// implementation
class StripePaymentProcessor implements PaymentProcessor{
    public void processPayment(){
        System.out.println("Processing Stripe Payment");
    }
} 
// implementation
class PayPalPaymentProcessor implements PaymentProcessor{
    public void processPayment(){
        System.out.println("Processing PayPal Payment");
    }
} 
// implementation
class SquarePaymentProcessor implements PaymentProcessor{
    public void processPayment(){
        System.out.println("Processing Square Payment");
    }
} 

//abstraction
abstract class Method{
    protected PaymentProcessor processor;
    Method (PaymentProcessor processor){
        this.processor=processor;
    }
    abstract void pay();
}

//refined abstraction
class CreditCardMethod extends Method{
    CreditCardMethod (PaymentProcessor processor){
        super (processor);
    }
    
    void pay(){
        processor.processPayment();
        System.out.println("Making Payment Using CreditCard");
    }
}

//refined abstraction
class PayPalMethod extends Method{
    PayPalMethod (PaymentProcessor processor){
        super (processor);
    }
    void pay(){
        System.out.println("Making Payment Using PayPal ");
        processor.processPayment();
    }
}
//refined abstraction
class CryptoMethod extends Method{
    CryptoMethod (PaymentProcessor processor){
        super (processor);
    }
    void pay(){
         processor.processPayment();
        System.out.println("Making Payment Using Crypto");
    }
}
public class Main {
    public static void main(String[] args) {
        Method payment1 = new CreditCardMethod(new StripePaymentProcessor());
        payment1.pay();
    
        Method payment2 = new PayPalMethod(new PayPalPaymentProcessor());
        payment2.pay();
    
        Method payment3 = new CryptoMethod(new SquarePaymentProcessor());
        payment3.pay();
    }
}
