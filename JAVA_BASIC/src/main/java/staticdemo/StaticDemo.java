package staticdemo;

/**
 * Created by zshen on 04/05/2017.
 */
public class StaticDemo {
    public static void main(String[] args) {

        int i = 10;

        Employee employee = new Employee();
        employee.setId(i);

        test1(i);
        test2(employee);
        System.out.println(i);
        System.out.println(employee.getId());
    }

    public static void test1(int i){
        i = 100;
    }

    public static void test2(Employee employee){
        employee.setId(100);
    }
}
