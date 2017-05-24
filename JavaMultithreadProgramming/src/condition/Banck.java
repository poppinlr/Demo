package condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zshen on 22/05/2017.
 */
public class Banck {

    private Condition condition;
    private Lock lock;

    public Banck(){
        lock = new ReentrantLock();
        this.condition = lock.newCondition();
    }
}
