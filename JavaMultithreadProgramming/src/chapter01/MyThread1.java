package chapter01;

/**
 * Created by zshen on 19/05/2017.
 */
public class MyThread1 extends Thread{


    private int count = 5;

    @Override
    public void run() {
        super.run();
        for(int i = 0; i <= count ; i++){
            count--;
            System.out.println(this.currentThread().getName() + " count: " + count);
        }
    }

}
