import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    HR hr=new HR("Rajesh Kumar", 1, "SaltLake,Kolkata", 70000);
    @Test
    @DisplayName("Calculate Salary ")
    public void Test(){
        double calSal=hr.calculatedSalary(70000);
        assertEquals(7000, calSal);
    }
    @Test
    @DisplayName("Testing the Name Fields")
    public void nameTest(){
        String name="Rajesh";
        Assertions.assertEquals("Rajesh", name);
    }
    @Test
    @DisplayName("Testing the ID Fields")
    public void getIdTest(){
        int id=1;
        Assertions.assertEquals(1,id);
    }
    @Test
    @DisplayName("Testing the Salary Fields")
    public void salaryTest(){
        String salary="70000";
        assertEquals(70000, salary);
    }
    @Test
    @DisplayName("Testing the Address Fields")
    public void EmployeeTest(){
        Employee emp=new Employee("Ram",1,"NewTown",70000);
        Assertions.assertEquals("NewTown", emp.getAddress());
    }
}
