package pattern03.abstractfactory.concept;

/**
 * Created by zshen on 16/03/2017.
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA(); //工厂方法一
    public abstract AbstractProductB createProductB(); //工厂方法二
}
