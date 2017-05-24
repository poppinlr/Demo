/**
 * Created by zshen on 6/15/16.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("test");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
