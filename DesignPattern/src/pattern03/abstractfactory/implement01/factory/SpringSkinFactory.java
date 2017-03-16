package pattern03.abstractfactory.implement01.factory;

import pattern03.abstractfactory.implement01.factory.SkinFactory;
import pattern03.abstractfactory.implement01.product.button.Button;
import pattern03.abstractfactory.implement01.product.combobox.ComboBox;
import pattern03.abstractfactory.implement01.product.combobox.SpringComboBox;
import pattern03.abstractfactory.implement01.product.textfield.SpringTextField;
import pattern03.abstractfactory.implement01.product.textfield.TextField;
import pattern03.abstractfactory.implement01.product.button.SpringButton;

/**
 * Created by zshen on 16/03/2017.
 */
public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
