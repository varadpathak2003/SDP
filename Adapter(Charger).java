//Target Interface
interface CType{
    void charge(int power,String type);
}
//Adaptee
class MicroUSBCharger{
    String type;
    MicroUSBCharger(String type){
        this.type=type;
    }
    void charge(){
        System.out.println("Charging using " + type+ "type charger");
    }
}

//Adapter
class CTypeAdapter implements CType{
    @Override
    public void charge(int power,String type){
        String finalMessage="Watt : "+power+" Type: " +type;
        MicroUSBCharger charger=new MicroUSBCharger(finalMessage);
        charger.charge();
    }
}

public class Main {
    public static void main(String[] args) {
        CTypeAdapter adapter=new CTypeAdapter();
        adapter.charge(50,"C");
    }
}
