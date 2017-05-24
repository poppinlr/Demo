package staticdemo;

import lombok.Data;

import java.util.Comparator;

/**
 * Created by zshen on 04/05/2017.
 */
@Data
public class Employee extends Object implements Comparable<Employee>, Cloneable, Comparator{
    public static int nextId = 1;
    private int id;

    static
    {
        System.out.println("static init");
    }

    public void setId(){
        nextId++;
        id = nextId;
        System.out.println(nextId);
    }

    public int compareTo(Employee employee) {
        return 0;
    }

    public Employee testClone(Employee employee){
        Employee returnEmp = null;
        try {
            returnEmp = (Employee)employee.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return returnEmp;
    }

    public void Employee(){
        
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
