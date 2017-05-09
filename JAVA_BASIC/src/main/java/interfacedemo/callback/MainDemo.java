package interfacedemo.callback;


import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by zshen on 05/05/2017.
 */
public class MainDemo {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000,listener);
        t.start();
    }
}
