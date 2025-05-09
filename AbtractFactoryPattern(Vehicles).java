interface engine {
    void start();
}
class TruckEngine implements engine{
    @Override
     public void start(){
        System.out.println("Truck Engine Started");
    }
}
class CarEngine implements engine{
    @Override
    public void start(){
        System.out.println("Car Engine Started");
    }
}
class MotorCyclesEngine implements engine{
    @Override
    public void start(){
        System.out.println("Motorcycle Engine Started");
    }
}
interface breaks{
    public void apply();
}

class TruckBreak implements breaks{
    @Override
     public void apply(){
        System.out.println("Truck Break Applied");
    }
}
class CarBreak implements breaks{
    @Override
    public void apply(){
        System.out.println("Car Break Applied");
    }
}
class MotorcycleBreak implements breaks{
    @Override
    public void apply(){
        System.out.println("Motorcycle Break Applied");
    }
}

interface transmissions{
    public void transmit();
}

class TruckTransmissions implements transmissions{
    @Override
    public void transmit(){
         System.out.println("Truck Transmission");
    }
}
class CarTransmissions implements transmissions{
   @Override 
    public void transmit(){
         System.out.println("Car Transmission");
    }
}
class MotorCyclesTransmissions implements transmissions{
    @Override
    public void transmit(){
         System.out.println("MotorCycles Transmission");
    }
}

interface VehicleFactory{
    public void createEngine();
    public void createBreaks();
    public void createTransmissions();
}

 class TruckVehicleFactory  implements VehicleFactory{
     @Override
     public void createEngine(){
         System.out.println(" Creating Truck Engine");
     }
     @Override
     public void createBreaks(){
         System.out.println(" Creating Truck Breaks");
     }
     @Override
     public void createTransmissions(){
         System.out.println(" Creating Truck Transmissions");
     }
 }
 class MotorcycleVehicleFactory  implements VehicleFactory{
     @Override
     public void createEngine(){
         System.out.println(" Creating Motorcycle Engine");
     }
     @Override
     public void createBreaks(){
         System.out.println(" Creating Motorcycle Breaks");
     }
     @Override
     public void createTransmissions(){
         System.out.println(" Creating Motorcycle Transmissions");
     }
 }
 class CarVehicleFactory  implements VehicleFactory{
     @Override
     public void createEngine(){
         System.out.println(" Creating Car Engine");
     }
     @Override
     public void createBreaks(){
         System.out.println(" Creating Car Breaks");
     }
     @Override
     public void createTransmissions(){
         System.out.println(" Creating Car Transmissions");
     }
 }

public class Main {
    public static void main(String[] args) {
        
        VehicleFactory truckFactory=new TruckVehicleFactory();
        truckFactory.createBreaks();
        truckFactory.createEngine();
        truckFactory.createTransmissions();
        
        VehicleFactory carFactory=new CarVehicleFactory();
        carFactory.createBreaks();
        carFactory.createEngine();
        carFactory.createTransmissions();
        
        VehicleFactory motorcycleFactory=new MotorcycleVehicleFactory();
        motorcycleFactory.createBreaks();
        motorcycleFactory.createEngine();
        motorcycleFactory.createTransmissions();
    }
}
