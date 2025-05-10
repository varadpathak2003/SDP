interface SlotMachine{
    public int spin();
}
class NormalSlotMachine implements SlotMachine{
    @Override
    public int spin(){
        //return  (int)(Math.random()*100);
        return 5;
    }
}
class MultiplierSlotMachine implements SlotMachine{
    
    private SlotMachine machine;
    MultiplierSlotMachine(SlotMachine slotMachine){
        this.machine=slotMachine;
    }
    int spinCount=0;
    public int spin(){
        int points=machine.spin();
        spinCount++;
        if (spinCount<=5){
            return points*2 ;
        }
        else return points;
    }
}
public class Main {
    public static void main(String[] args) {
       SlotMachine machine=new MultiplierSlotMachine(new NormalSlotMachine());
        for (int i=0;i<7;i++){
            System.out.println(machine.spin());
        }
    }
}
