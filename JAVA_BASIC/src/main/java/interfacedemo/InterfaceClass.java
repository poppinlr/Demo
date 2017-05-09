package interfacedemo;

/**
 * Created by zshen on 05/05/2017.
 */
public interface InterfaceClass {
    public abstract void absFun();
    public void Fun();

    default void FunDefault(){
        System.out.println("");
    }

}
