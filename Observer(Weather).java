import java.util.*;
class Main{
    public static void main(String args[]){
        Observer o1=new PhoneDisplay();
        Observer o2=new LaptopDisplay();
        Subject subject=new ConcreteSubject();
        subject.add(o1);
        subject.add(o2);
        subject.setWeather("Sunny");
        subject.setWeather("Rainy");
    }
}
interface Subject{
    public void add(Observer o);
    public void removeObserver(Observer o);
    public void notifyAllObservers();
    public void setWeather(String weather);
}

class ConcreteSubject implements Subject{
    String weather;
    List <Observer> observers;
    public void setWeather(String weather){
         this.weather=weather;
        notifyAllObservers();
    }
    ConcreteSubject (){
        this.observers=new ArrayList<>();
    }
    public void notifyAllObservers(){
        for (Observer o : observers){
            o.update(weather);
        }
    }
    public void add(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
}
interface Observer {
    public void update(String weather);
}
//concreteobserver
class PhoneDisplay implements Observer{
    public void update(String weather){
        System.out.println("Weather Updated on phone display : "+weather);
    }
}
//concreteobserver
class LaptopDisplay implements Observer{
    public void update(String weather){
        System.out.println("Weather Updated on laptop display : "+weather);
    }
}
