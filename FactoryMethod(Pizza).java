interface Pizza{
    public void make();
}
class Cheese implements Pizza{
    @Override
    public void make (){
        System.out.println("Cheesse Pizza");
    }
}
class Paneer implements Pizza{
    @Override
    public void make (){
        System.out.println("Paneer Pizza");
    }
}

interface PizzaFactory{
    public Pizza createPizza();
}
class CheesePizzaFactory implements PizzaFactory{
    public Pizza createPizza(){
        return new Cheese();
    }
}
class PaneerPizzaFactory implements PizzaFactory{
    public Pizza createPizza(){
        return new Paneer();
    }
}
class Main {
    
    public static void main(String[] args) {
        PizzaFactory factory=new PaneerPizzaFactory();
        Pizza pizza=factory.createPizza();
        pizza.make();
        PizzaFactory factory2=new CheesePizzaFactory();
        Pizza Cheesepizza=factory2.createPizza();
        Cheesepizza.make();
    }
}
