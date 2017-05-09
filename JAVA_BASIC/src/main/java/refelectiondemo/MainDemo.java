package refelectiondemo;

import staticdemo.Employee;

/**
 * Created by zshen on 05/05/2017.
 */
public class MainDemo {

    public static void main(String[] args) {

//        System.out.println(int.class.getName());
//        System.out.println(int[].class.getName());
//
//        try {
//            System.out.println(EnumDemo.class.newInstance());
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }

        Employee.class.getFields();
        Employee.class.getDeclaredFields();
        Employee.class.getDeclaringClass();
        Employee.class.getModifiers();
    }
}
