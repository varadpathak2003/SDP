interface Employee {
    void calculateSalary(int salary,int bonus,int allowance);
}

class PermanentEmployee implements Employee {
    public void calculateSalary(int salary,int bonus,int allowance) {
        System.out.println("Salary Of permanent Employee  : "+(salary+bonus+allowance));
    }
}
class ContractEmployee implements Employee {
    
    public void calculateSalary(int salary,int bonus,int allowance) {
        System.out.println("Salary Of Contract Employee  : "+(salary+bonus+allowance));
    }
}
interface Factory{
    public Employee createEmployee();
}

class PermanentEmpFactory implements Factory{
    public Employee createEmployee(){
        return new PermanentEmployee();
    }
}
class ContractEmpFactory implements Factory{
    public Employee createEmployee(){
        return new ContractEmployee();
    }
}

public class Main {
    public static void main(String[] args) {
        Factory pFactory = new PermanentEmpFactory();
        Employee e=pFactory.createEmployee();
        e.calculateSalary(10000,2000,5000);
        
        Factory cFactory = new ContractEmpFactory();
        Employee con=cFactory.createEmployee();
        con.calculateSalary(10000,500,5000);
    }
}
