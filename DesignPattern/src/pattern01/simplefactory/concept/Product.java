package pattern01.simplefactory.concept;

/**
 * Created by zshen on 11/01/2017.
 */

/**
 * Product（抽象产品角色）：它是工厂类所创建的所有对象的父类，封装了各种产品对象的公有方法，
 * 它的引入将提高系统的灵活性，使得在工厂类中只需定义一个通用的工厂方法，
 * 因为所有创建的具体产品对象都是其子类对象。+
 */
public abstract class Product {

    //公共方法
    public void methodPublic(){
        System.out.println("Product defined method methodPublic");
    }

    //抽象方法
    public abstract void methodAbstract();
}
