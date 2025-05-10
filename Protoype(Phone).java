// Prototype Interface
interface PhonePrototype {
    PhonePrototype clone();
}
// Concrete Prototype
class Smartphone implements PhonePrototype {
    private String model;
    private String ram;
    private String storage;
    private String color;

    public Smartphone(String model, String ram, String storage, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.color = color;
    }

    @Override
    public PhonePrototype clone() { 
        return new Smartphone(model, ram, storage, color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showSpecs() {
        System.out.println("Model: " + model + ", RAM: " + ram +
                           ", Storage: " + storage + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone basePhone = new Smartphone("Galaxy S24", "8GB", "256GB", "Matte Black");
        Smartphone phone1 = (Smartphone) basePhone.clone();
        phone1.setColor("Ice Blue");
        phone1.showSpecs();
    }
}
