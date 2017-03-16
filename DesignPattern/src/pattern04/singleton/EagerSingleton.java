package pattern04.singleton;

/**
 * Created by zshen on 16/03/2017.
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
        super();
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
