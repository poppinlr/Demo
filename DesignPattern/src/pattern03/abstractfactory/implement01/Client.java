package pattern03.abstractfactory.implement01;

import pattern03.abstractfactory.implement01.factory.SkinFactory;
import pattern03.abstractfactory.implement01.factory.SpringSkinFactory;
import pattern03.abstractfactory.implement01.factory.SummerSkinFactory;
import pattern03.abstractfactory.implement01.product.button.Button;
import pattern03.abstractfactory.implement01.product.combobox.ComboBox;
import pattern03.abstractfactory.implement01.product.textfield.TextField;

/**
 * Created by zshen on 16/03/2017.
 */
public class Client {
    public static void main(String args[]) {
        //使用抽象层定义
        Button bt;
        TextField tf;
        ComboBox cb;
        SkinFactory factory = new SpringSkinFactory();
        SkinFactory factoryTemp = new SummerSkinFactory();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
