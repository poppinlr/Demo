package inheritancedemo;

/**
 * Created by zshen on 04/05/2017.
 */
public class SubClass extends SuperClass{

    private int superParam;

    public SubClass(int superParam){
        super(superParam);
        this.superParam = 2;
        System.out.println("SubClass");
    }

    @Override
    public void fun(){
        System.out.println("sub class fun");
    }
}
