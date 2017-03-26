package TheDecoratorPattern.MainEntities;

import TheDecoratorPattern.baseEntity.Drink;

/**
 * Created by ud on 22/3/17.
 */
public class Juice extends Drink {

    public Juice(){
        Description="This is lemon Juice";
    }

    @Override
    public double cost() {
        return .98;
    }
}
