import java.util.LinkedList;
import java.util.List;

class Employee {
    public String name;
    public int id;
    public String address;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int id, String address, double salary) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.salary = salary;
    }

}

class CEO extends Employee {

    public CEO(String name, int id, String address, double salary) {
        super(name, id, address, salary);
    }

}

class projectManager extends Employee {

    public projectManager(String name, int id, String address, double salary) {
        super(name, id, address, salary);
    }

}

class teamLead extends Employee {

    public teamLead(String name, int id, String address, double salary) {
        super(name, id, address, salary);
    }

}

class HR extends Employee {
    public double hike = 0.1;

    public HR(String name, int id, String address, double salary) {
        super(name, id, address, salary);
    }

    public double calculatedSalary(double salary) {
        return salary * hike;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        try{
        List<HR> list=new LinkedList<HR>();
        list.add(new HR("Rajesh Kumar", 1, "SaltLake,Kolkata", 70000));
        list.add(new HR("Rakesh kundu", 2, "NewTown,Kolkata", 80000));
        list.add(new HR("Ramesh Sharma", 3, "Esplanade,Kolkata", 40000));
        list.add(1, new HR("Ramesh Sharma", 4, "Esplanade,Kolkata", 40000));
        for(HR i:list){
            System.out.println("Name: "+i.getName()+" "+"Address: "+i.getAddress()+" "+"Id: "+
            i.getId()+" "+"Salary: "+i.getSalary()+" "+"CalculatedSalary: "+i.calculatedSalary(70000));  
        }
        }
        catch(Exception e){
            System.out.println("Error in"+e.getMessage());
        }
    }
}