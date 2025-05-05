//prototype interface
interface Enemy{
    Enemy clone();
    void spawn();
}

// concrete prototype
class Zombie implements Enemy{
    private String type;
    private int health;
    private int attackPower;
    private String behaviour;
    
    Zombie(String type,int health,int attackPower,String behaviour){
        this.type=type;
        this.health=health;
        this.attackPower=attackPower;
        this.behaviour=behaviour;
    }
    
    @Override
    public Zombie clone() {
        return new Zombie(this.type, this.health, this.attackPower, this.behaviour);
    }
    
    @Override
    public void spawn(){
        System.out.println("Zombie Spawned");
    }
}

//concrete protoype
class Alien implements Enemy{
    private String type;
    private int health;
    private int attackPower;
    private String behaviour;
    
    Alien(String type,int health,int attackPower,String behaviour){
        this.type=type;
        this.health=health;
        this.attackPower=attackPower;
        this.behaviour=behaviour;
    }
    
    @Override
    public Alien clone(){
        return new Alien(this.type, this.health, this.attackPower, this.behaviour);
    }
    
    @Override
    public void spawn(){
        System.out.println("Alien Spawned");
    }
}
//Client Code
public class Main {
    public static void main(String[] args) {
        Enemy zombiePrototype = new Zombie("Zombie", 100, 20, "Aggressive");
        Enemy alienPrototype = new Alien("Alien", 300, 50, "Defensive");

        Enemy zombie1 = zombiePrototype.clone();
        Enemy alien1 = alienPrototype.clone();

        zombie1.spawn();
        alien1.spawn();
    }
}
