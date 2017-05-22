package chapter01;

/**
 * Created by zshen on 19/05/2017.
 */
public class MyThread3 extends Thread{

    @Override
    public void run() {
        super.run();
        String a = "s";
        try {
            a.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
