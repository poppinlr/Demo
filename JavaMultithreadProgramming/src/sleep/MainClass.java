package sleep;


/**
 * Created by zshen on 19/05/2017.
 */
public class MainClass {
    public static void main(String[] args) {


    }

    class Mythread1 extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                System.out.println("run threadName=" + this.currentThread().getName() + "begin");
                Thread.sleep(2000);
                System.out.println("run threadName=" + this.currentThread().getName() + "end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Mythread2 extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                System.out.println("run threadName=" + this.currentThread().getName() + "begin" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("run threadName=" + this.currentThread().getName() + "end" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
