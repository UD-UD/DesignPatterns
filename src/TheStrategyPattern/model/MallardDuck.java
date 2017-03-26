package TheStrategyPattern.model;

import TheStrategyPattern.domain.Duck;
import TheStrategyPattern.services.FlyWithWings;
import TheStrategyPattern.services.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackInterface = new Quack();
		flyInterface = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
