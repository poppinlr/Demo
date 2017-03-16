package pattern01.simplefactory.concept;

/**
 * Created by zshen on 11/01/2017.
 */

/**
 * ConcreteProduct（具体产品角色）：它是简单工厂模式的创建目标，所有被创建的对象都充当这个角色的某个具体类的实例。
 * 每一个具体产品角色都继承了抽象产品角色，需要实现在抽象产品中声明的抽象方法。
 */
public class ConcreteProductA extends Product{

    //实现父类定义的抽象方法
    @Override
    public void methodAbstract() {
        System.out.println("ConcreteProductA defined method methodAbstract");
    }
}
