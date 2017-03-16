package pattern02.factorymethod.concept;

/**
 * Created by zshen on 16/03/2017.
 */
class ConcreteFactory implements Factory {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}