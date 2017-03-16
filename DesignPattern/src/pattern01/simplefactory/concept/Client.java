package pattern01.simplefactory.concept;

/**
 * Created by zshen on 07/03/2017.
 */
public class Client {
    public static void main(String args[]) {
        Product product;
        product = Factory.getProduct("A"); //通过工厂类创建产品对象
        product.methodPublic();
        product.methodAbstract();
    }
}
