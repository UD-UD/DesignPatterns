package TheStrategyPattern.model;

import TheStrategyPattern.domain.Duck;
import TheStrategyPattern.services.FlyWithWings;
import TheStrategyPattern.services.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyInterface = new FlyWithWings();
		quackInterface = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
