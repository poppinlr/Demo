package pattern03.abstractfactory.implement01.product.textfield;

import pattern03.abstractfactory.implement01.product.textfield.TextField;

/**
 * Created by zshen on 16/03/2017.
 */
public class SpringTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}
