package pattern03.abstractfactory.implement01.product.combobox;

import pattern03.abstractfactory.implement01.product.combobox.ComboBox;

/**
 * Created by zshen on 16/03/2017.
 */
public class SpringComboBox implements ComboBox {

    @Override
    public void display() {
        System.out.println("显示绿色边框组合框。");
    }
}
