package interfacedemo.callback;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by zshen on 05/05/2017.
 */
public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println(new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
