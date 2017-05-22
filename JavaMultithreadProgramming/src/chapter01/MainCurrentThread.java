package chapter01;

/**
 * Created by zshen on 19/05/2017.
 */
public class MainCurrentThread {

    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());

//        MyThread myThread = new MyThread();
//        new Thread(myThread,"A").start();
//        new Thread(myThread,"B").start();
//        new Thread(myThread,"C").start();
//        new Thread(myThread,"D").start();

//        MyThread1 myThread1 = new MyThread1();
//        new Thread(myThread1,"A").start();
//        new Thread(myThread1,"B").start();
//        new Thread(myThread1,"C").start();
//        new Thread(myThread1,"D").start();
////
//        MyThread2 myThread2 = new MyThread2();
//        new Thread(myThread2,"A").start();
//        new Thread(myThread2,"B").start();
//        new Thread(myThread2,"C").start();
//        new Thread(myThread2,"D").start();

//        ALogin aLogin = new ALogin();
//        aLogin.start();
//        BLogin bLogin = new BLogin();
//        bLogin.start();

        MyThread3 thread3 = new MyThread3();
        thread3.start();
        new Thread(thread3).start();
    }
}
