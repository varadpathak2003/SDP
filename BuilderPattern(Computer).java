//create concrete class computer
class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setRAM(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
    
    public void getInfo() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
    }
}

//create builder interface
interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer build();
}

//concrete builder 
class GamingComputerBuilder implements Builder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("Gaming CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    @Override
    public Computer build() {
        return computer;
    }
}

//Client Code
public class Main {
    public static void main(String[] args) {
        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
        gamingBuilder.buildCPU();
        gamingBuilder.buildRAM();
        gamingBuilder.buildStorage();
        Computer gamingComputer =gamingBuilder.build();
        gamingComputer.getInfo();
    }
}
