package pattern03.abstractfactory.implement01.product.button;

import pattern03.abstractfactory.implement01.product.button.Button;

/**
 * Created by zshen on 16/03/2017.
 */
public class SummerButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}
