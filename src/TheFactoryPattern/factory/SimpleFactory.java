package TheFactoryPattern.factory;

import TheFactoryPattern.domain.Pizza;
import TheFactoryPattern.pizzaImpl.CheesePizza;
import TheFactoryPattern.pizzaImpl.ClamPizza;
import TheFactoryPattern.pizzaImpl.PepperoniPizza;
import TheFactoryPattern.pizzaImpl.VeggiePizza;

/**
 * Created by ud on 24/3/17.
 */
public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
