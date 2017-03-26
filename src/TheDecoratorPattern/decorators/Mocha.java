package TheDecoratorPattern.decorators;

import TheDecoratorPattern.baseEntity.Drink;

public class Mocha extends DrinkDecorator {
	Drink beverage;
 
	public Mocha(Drink beverage) {
		this.beverage = beverage;
		//this.beverage.Description=beverage.getGetDescription() + ", Mocha";
	}
 
	public String getGetDescription() {
		return beverage.getGetDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
