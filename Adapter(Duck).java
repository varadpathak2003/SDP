// Duck interface
interface Duck {
    void quack();
}

// Turkey class
class Turkey {
    public void gobble() {
        System.out.println("Gobble gobble!");
    }
}

// Real Duck implementation
class RealDuck implements Duck {
    public void quack() {
        System.out.println("Quack quack!");
    }
}

// Adapter: makes a Turkey behave like a Duck
class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Turkey turkey = new Turkey();
        Duck adaptedTurkey = new TurkeyAdapter(turkey);
        adaptedTurkey.quack(); // Output: Gobble gobble!

        Duck realDuck = new RealDuck();
        realDuck.quack(); // Output: Quack quack!
    }
}
