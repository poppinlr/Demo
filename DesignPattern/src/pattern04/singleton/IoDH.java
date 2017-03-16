package pattern04.singleton;

/**
 * Created by zshen on 16/03/2017.
 */
public class IoDH {
    private IoDH(){
        super();
        System.out.println("test");
    }

    private static class HolderClass{
        private final static IoDH instance = new IoDH();
    }

    public static IoDH getInstance(){
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        System.out.println(IoDH.getInstance().equals(IoDH.getInstance()));
    }
}
