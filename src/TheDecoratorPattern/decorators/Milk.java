package TheDecoratorPattern.decorators;

import TheDecoratorPattern.baseEntity.Drink;

/**
 * Created by ud on 22/3/17.
 */
public class Milk extends DrinkDecorator {
    Drink beverage;

    public Milk(Drink beverage) {
        this.beverage = beverage;
        //this.beverage.Description=beverage.getGetDescription() + ", Milk";
    }

    public String getGetDescription() {
        return beverage.getGetDescription() + ", Milk";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
