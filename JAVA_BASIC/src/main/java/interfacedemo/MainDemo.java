package interfacedemo;

/**
 * Created by zshen on 05/05/2017.
 */
public class MainDemo {

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbsSubClass();
        abstractClass.absFun();

        InterfaceClass interfaceClass = new InterfaceClass() {
            public void absFun() {

            }

            public void Fun() {

            }
        };
    }
}
