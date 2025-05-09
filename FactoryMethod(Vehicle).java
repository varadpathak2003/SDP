import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starting...");
    }
    public void stop() {
        System.out.println("Car stopping...");
    }
}

class Truck implements Vehicle {
    public void start() {
        System.out.println("Truck starting...");
    }
    public void stop() {
        System.out.println("Truck stopping...");
    }
}

class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle starting...");
    }
    public void stop() {
        System.out.println("Motorcycle stopping...");
    }
}

class VehicleFactory {
    private static final Map<String, Vehicle> registry = new HashMap<>();
    
     static {
        // Register default vehicle types
        registerVehicle("car", new Car());
        registerVehicle("truck", new Truck());
        registerVehicle("motorcycle",  new Motorcycle());
    }
    
    public static void registerVehicle(String type,Vehicle vehicle ) {
        registry.put(type,vehicle);
    }
    
    public static Vehicle createVehicle(String type) {
        Vehicle vehicle = registry.get(type);
        return vehicle;
    }
    
}
public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vehicle type : ");
        String type=sc.next();     
        Vehicle vehicle =VehicleFactory.createVehicle(type);
        vehicle.start();
        vehicle.stop();
    }
}
