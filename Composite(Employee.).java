import java.util.*;
//Component
interface Employee{
     void getDetails();
     int getSalary();
}
//leaf
class Developer implements Employee{
    String name;
    int salary;
    
    Developer (String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public void getDetails (){
        System.out.println("Name : "+name + " || Salary: "+salary);
    }
    
    public int getSalary(){
        return this.salary;
    }
}

//Composite
class Department implements Employee{
    String name;
    List <Employee> dev;
    
    Department (String name){
        this.name=name;
        this.dev=new ArrayList<>();
    }
    
    public void add(Employee e) {
        dev.add(e);
    }

   public  void getDetails(){
        System.out.println(" All Employees of the  : "+name);
        for (Employee d : dev){
            d.getDetails();
        }
       
    }
    
    public int getSalary(){
        int total=0;
        for (Employee d : dev){
            total+=d.getSalary();
        }
       return total;
    }
}

//Composite
class Company implements Employee{
    String name;
    List <Employee> list;
    
    Company (String name){
        list=new ArrayList<>();
        this.name=name;
    }
    
    public void add(Employee e) {
        list.add(e);
    }

    
    public void getDetails(){
        System.out.println(" All Employees of the company ");
        for (Employee d  : list){
            d.getDetails();
        }
    }
    
    public int getSalary(){
        int total=0;
        for (Employee d : list){
            total+=d.getSalary();
        }
       return total;
    }
}

//Client Code
public class Main {
    public static void main(String[] args) {
        // All Employees
        Employee pranav = new Developer("Pranav", 50000);
        Employee rohit = new Developer("Rohit", 30000);
        Employee virat = new Developer("Virat", 80000);
        Employee rahul = new Developer("Rahul", 63000);
        Employee hardik = new Developer("Hardik", 63000);

        // hr employee
        Department hr = new Department("HR"); // ✅ Use actual type
        hr.add(pranav);
        hr.add(virat);
        hr.add(hardik);
        hr.getDetails();
        System.out.println("TOTAL Salary of HR Department : "+hr.getSalary());

        // It employee
        Department it = new Department("IT"); // ✅ Use actual type
        it.add(rohit);
        it.add(rahul);
        it.getDetails();
        System.out.println("TOTAL Salary of IT Department : "+it.getSalary());

        // Company tcs
        Company tcs = new Company("TCS"); // ✅ Use actual type
        tcs.add(hr);
        tcs.add(it);
        tcs.getDetails();
        System.out.println("TOTAL Salary of All Employees : "+tcs.getSalary());
    }
}
