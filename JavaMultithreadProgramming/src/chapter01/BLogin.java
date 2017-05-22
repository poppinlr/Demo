package chapter01;

/**
 * Created by zshen on 19/05/2017.
 */
public class BLogin extends Thread{

    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("b","bb");
    }
}
