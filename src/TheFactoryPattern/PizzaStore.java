package TheFactoryPattern;

import TheFactoryPattern.domain.Pizza;
import TheFactoryPattern.factory.SimpleFactory;

public class PizzaStore {
	SimpleFactory factory;
 
	public PizzaStore(SimpleFactory factory) {
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
