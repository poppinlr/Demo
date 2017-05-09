package hashcodedemo;

import staticdemo.Employee;

/**
 * Created by zshen on 04/05/2017.
 */
public class HashCodeDemo {

    public static void main(String[] args) {
        System.out.println("sb".hashCode() == "bs".hashCode());
        System.out.println("sb".hashCode() == "sb".hashCode());

        Employee employee1 = new Employee();
        employee1.setId(1);
        Employee employee2 = new Employee();
        employee2.setId(1);
        System.out.println(employee1.hashCode() == employee2.hashCode());
        System.out.println(employee1.equals(employee2));
    }
}
