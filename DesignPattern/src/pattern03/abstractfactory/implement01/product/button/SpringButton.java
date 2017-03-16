package pattern03.abstractfactory.implement01.product.button;

import pattern03.abstractfactory.implement01.product.button.Button;

/**
 * Created by zshen on 16/03/2017.
 */
public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}
