interface SlotMachine{
public int spin();
}
class NormalSlotMachine implements SlotMachine{
@Override
public int spin(){
//return  (int)(Math.random()\*100);
return 5;
}
}
class SlotMachineProxy implements SlotMachine{
private SlotMachine machine;
SlotMachineProxy(SlotMachine slotMachine){
    this.machine=slotMachine;
}
public int spin(){
    int time=5;
    if (time>=4 && time <=6){
        System.out.println("Under Maintenance");
        return -1;
    }
    return machine.spin();
}

}
public class Main {
public static void main(String\[] args) {
SlotMachine proxy=new SlotMachineProxy(new NormalSlotMachine());
System.out.println(proxy.spin());
System.out.println(proxy.spin());
}
}
