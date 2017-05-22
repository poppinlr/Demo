package chapter01;

/**
 * Created by zshen on 19/05/2017.
 */
public class MyThread2 extends Thread{

    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println(this.currentThread().getName() + " count: " + count);
    }
}
