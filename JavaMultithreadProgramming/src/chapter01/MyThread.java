package chapter01;

/**
 * Created by zshen on 19/05/2017.
 */
public class MyThread extends Thread{

    private int count = 5;

    @Override
    public void run() {
        super.run();
        while (count > 0){
            count --;
            System.out.println(this.currentThread().getName() + " count: " + count);
        }
    }
}
