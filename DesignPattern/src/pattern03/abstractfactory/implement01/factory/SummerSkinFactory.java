package pattern03.abstractfactory.implement01.factory;

import pattern03.abstractfactory.implement01.factory.SkinFactory;
import pattern03.abstractfactory.implement01.product.button.Button;
import pattern03.abstractfactory.implement01.product.combobox.ComboBox;
import pattern03.abstractfactory.implement01.product.combobox.SummerComboBox;
import pattern03.abstractfactory.implement01.product.textfield.SummerTextField;
import pattern03.abstractfactory.implement01.product.textfield.TextField;
import pattern03.abstractfactory.implement01.product.button.SummerButton;

/**
 * Created by zshen on 16/03/2017.
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
