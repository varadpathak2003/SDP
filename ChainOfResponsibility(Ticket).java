import java.util.*;
class Main {
    public static void main(String args[]) {
        Handler l2 = new L2Handler("L2");
        Handler l1 = new L1Handler("L1");
        l1.setNext(l2);
        l1.handle(new Ticket("install", "Description"));
    }
}
class Ticket {
    String type;
    String desc;
    
    Ticket(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
abstract class Handler {
    Handler next;
    String name;
    
    Handler(String name) {
        this.name = name;
    }
    
    void setNext(Handler next) {
        this.next = next;
    }
    public void handle(Ticket t) {
        if (canHandle(t)) {
            System.out.println(this.name + " handled " + t.type);
        }
        else if (next != null) {
            next.handle(t);
        }
        else {
            System.out.println("Nobody could handle: " + t.type);
        }
    }
    abstract boolean canHandle(Ticket t);
}
class L1Handler extends Handler {
    L1Handler(String name) {
        super(name);
    }
    
    public boolean canHandle(Ticket t) {
        return t.type.equals("password");
    }
}
class L2Handler extends Handler {
    L2Handler(String name) {
        super(name);
    }

    boolean canHandle(Ticket t) {
        return t.type.equals("install");
    }
}
