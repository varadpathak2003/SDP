// Interfaces
interface Engine {
    void start();
}
interface Brakes {
    void apply();
}
interface Transmissions {
    void transmit();
}

// North America Car Components
class NACarEngine implements Engine {
    public void start() {
        System.out.println("North America Car Engine Started");
    }
}
class NACarBrakes implements Brakes {
    public void apply() {
        System.out.println("North America Car Brakes Applied");
    }
}
class NACarTransmissions implements Transmissions {
    public void transmit() {
        System.out.println("North America Car Transmission");
    }
}

// Europe Truck Components
class EuropeTruckEngine implements Engine {
    public void start() {
        System.out.println("Europe Truck Diesel Engine Started");
    }
}
class EuropeTruckBrakes implements Brakes {
    public void apply() {
        System.out.println("Europe Truck Brakes Applied");
    }
}
class EuropeTruckTransmissions implements Transmissions {
    public void transmit() {
        System.out.println("Europe Truck Transmission");
    }
}

// Abstract Factory
interface VehicleFactory {
    Engine createEngine();
    Brakes createBrakes();
    Transmissions createTransmissions();
}

// Concrete Factories
class NACarFactory implements VehicleFactory {
    public Engine createEngine() {
        return new NACarEngine();
    }
    public Brakes createBrakes() {
        return new NACarBrakes();
    }
    public Transmissions createTransmissions() {
        return new NACarTransmissions();
    }
}

class EuropeTruckFactory implements VehicleFactory {
    public Engine createEngine() {
        return new EuropeTruckEngine();
    }
    public Brakes createBrakes() {
        return new EuropeTruckBrakes();
    }
    public Transmissions createTransmissions() {
        return new EuropeTruckTransmissions();
    }
}
public class Main {
    public static void main(String[] args) {
        VehicleFactory naCarFactory = new NACarFactory();
        Engine carEngine = naCarFactory.createEngine();
        carEngine.start();
        naCarFactory.createBrakes().apply();
        naCarFactory.createTransmissions().transmit();

        VehicleFactory euTruckFactory = new EuropeTruckFactory();
        Engine truckEngine = euTruckFactory.createEngine();
        truckEngine.start();
        euTruckFactory.createBrakes().apply();
        euTruckFactory.createTransmissions().transmit();
    }
}
