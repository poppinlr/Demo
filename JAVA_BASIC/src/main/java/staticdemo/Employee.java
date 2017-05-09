package staticdemo;

import lombok.Data;

/**
 * Created by zshen on 04/05/2017.
 */
@Data
public class Employee implements Comparable<Employee>{
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
}
