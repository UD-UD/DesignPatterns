package TheStrategyPattern.model;

import TheStrategyPattern.domain.Duck;
import TheStrategyPattern.services.FlyNoWay;
import TheStrategyPattern.services.Quack;

/**
 * Created by ud on 21/3/17.
 */
public class Model extends Duck {

        public Model() {
            flyInterface = new FlyNoWay(); //Setting duck fly behavious
            quackInterface = new Quack();  //setting duck quack behaviour
        }

        public void display() {
            System.out.println("I'm a model duck");
        }

}
