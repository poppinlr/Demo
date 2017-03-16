package pattern01.simplefactory.concept;

/**
 * Created by zshen on 11/01/2017.
 */

/**
 Factory（工厂角色）：工厂角色即工厂类，它是简单工厂模式的核心，负责实现创建所有产品实例的内部逻辑；
 工厂类可以被外界直接调用，创建所需的产品对象；
 在工厂类中提供了静态的工厂方法factoryMethod()，它的返回类型为抽象产品类型Product。
 */
public class Factory {

    //静态工厂方法

    /**
     * 简单工厂模式的核心是工厂类，在没有工厂类之前，客户端一般会使用new关键字来直接创建产品对象，
     * 而在引入工厂类之后，客户端可以通过工厂类来创建产品，在简单工厂模式中，工厂类提供了一个静态工厂方法供客户端使用，
     * 根据所传入的参数不同可以创建不同的产品对象
     * @param arg
     * @return
     */
    public static Product getProduct(String arg){

        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
            //初始化设置product
        }
        else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
            //初始化设置product
        }
        return product;
    }

}
