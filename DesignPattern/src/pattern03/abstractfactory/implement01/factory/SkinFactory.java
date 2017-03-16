package pattern03.abstractfactory.implement01.factory;

import pattern03.abstractfactory.implement01.product.button.Button;
import pattern03.abstractfactory.implement01.product.combobox.ComboBox;
import pattern03.abstractfactory.implement01.product.textfield.TextField;

/**
 * Created by zshen on 16/03/2017.
 */
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
