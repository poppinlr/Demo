package runnabledemo;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zshen on 12/05/2017.
 */
public class RunnableMain {
    public static void main(String[] args) {
        Runnable r = () -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().isInterrupted());
        };

        while (Thread.currentThread().isInterrupted()){
            System.out.println("interrupted");
        }
        Thread t = new Thread(r);
        t.start();


        ArrayList<String> list = new ArrayList<>();
//        list.sort();

        HashSet hashSet = new HashSet();
        Hashtable hashtable = new Hashtable();
        HashMap<String,String> hashMap = new HashMap<>();
        Map map = Collections.synchronizedMap(hashMap);

        ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service1 = Executors.newCachedThreadPool();


    }
}
