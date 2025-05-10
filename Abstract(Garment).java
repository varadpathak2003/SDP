// Product Interfaces
interface Shirt {
    void stitch();
}
interface Trouser {
    void sew();
}
interface Gadget {
    void assemble();
}

// US Products
class USShirt implements Shirt {
    public void stitch() {
        System.out.println("US Shirt stitched");
    }
}
class USTrouser implements Trouser {
    public void sew() {
        System.out.println("US Trouser sewn");
    }
}
class USGadget implements Gadget {
    public void assemble() {
        System.out.println("US Gadget assembled");
    }
}

// UK Products
class UKShirt implements Shirt {
    public void stitch() {
        System.out.println("UK Shirt stitched");
    }
}
class UKTrouser implements Trouser {
    public void sew() {
        System.out.println("UK Trouser sewn");
    }
}
class UKGadget implements Gadget {
    public void assemble() {
        System.out.println("UK Gadget assembled");
    }
}

// Abstract Factory
interface Factory {
    Shirt createShirt();
    Trouser createTrouser();
    Gadget createGadget();
}

// US Factory
class USFactory implements Factory {
    public Shirt createShirt() {
        return new USShirt();
    }
    public Trouser createTrouser() {
        return new USTrouser();
    }
    public Gadget createGadget() {
        return new USGadget();
    }
}

// UK Factory
class UKFactory implements Factory {
    public Shirt createShirt() {
        return new UKShirt();
    }
    public Trouser createTrouser() {
        return new UKTrouser();
    }
    public Gadget createGadget() {
        return new UKGadget();
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        Factory usFactory = new USFactory();
        Shirt usShirt = usFactory.createShirt();
        Trouser usTrouser = usFactory.createTrouser();
        Gadget usGadget = usFactory.createGadget();

        usShirt.stitch();
        usTrouser.sew();
        usGadget.assemble();

        Factory ukFactory = new UKFactory();
        Shirt ukShirt = ukFactory.createShirt();
        Trouser ukTrouser = ukFactory.createTrouser();
        Gadget ukGadget = ukFactory.createGadget();

        ukShirt.stitch();
        ukTrouser.sew();
        ukGadget.assemble();
    }
}
