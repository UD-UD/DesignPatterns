package TheDecoratorPattern.MainEntities;

import TheDecoratorPattern.baseEntity.Drink;

/**
 * Created by ud on 22/3/17.
 */
public class Coffee extends Drink {

    public Coffee() {
        Description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
