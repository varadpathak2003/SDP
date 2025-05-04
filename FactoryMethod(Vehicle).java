interface Vehicle {
    public void printVehicle();
}

class TwoWheeler implements Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler implements Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

interface VehicleFactory {
    Vehicle createVehicle();
}

class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}

class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleFactory twoFactory = new TwoWheelerFactory();
        Vehicle two = twoFactory.createVehicle();
        two.printVehicle();

        VehicleFactory fourFactory = new FourWheelerFactory();
        Vehicle four = fourFactory.createVehicle();
        four.printVehicle();
    }
}
