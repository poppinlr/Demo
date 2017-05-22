package inheritancedemo;

import lombok.Data;

/**
 * Created by zshen on 04/05/2017.
 */
@Data
public class SuperClass {

    private int superParam;

    public SuperClass(int superParam){
        this.superParam = superParam;
        System.out.println("super class");
    }

    public void fun(){
        System.out.println("superClass fun");
    }
}
