package TheFactoryPattern;

import TheFactoryPattern.domain.Pizza;
import TheFactoryPattern.factory.SimpleFactory;

/**
 * Created by ud on 24/3/17.
 */
public class AppMain {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
