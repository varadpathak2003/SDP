//prototype interface
interface EnemyPrototype{
    Enemy clone();
    void spawn();
}

// concrete prototype
class Enemy implements EnemyPrototype{
    private String type;
    private int health;
    private int attackPower;
    private String behaviour;
    
    Enemy(String type,int health,int attackPower,String behaviour){
        this.type=type;
        this.health=health;
        this.attackPower=attackPower;
        this.behaviour=behaviour;
    }
    
    public void setType(String type){
        this.type=type;
    }
    
    @Override
    public Enemy clone() {
        return new Enemy(this.type, this.health, this.attackPower, this.behaviour);
    }
    
    @Override
    public void spawn(){
        System.out.println(this.type + " Spawned");
    }
}
public class Main {
    public static void main(String[] args) {
        Enemy enemy = new Enemy("Zombie", 100, 20, "Aggressive");

        Enemy alien = enemy.clone();
        alien.setType("Alien");
        alien.spawn();
    }
}
