package TheStrategyPattern.model;

import TheStrategyPattern.domain.Duck;
import TheStrategyPattern.services.FlyNoWay;
import TheStrategyPattern.services.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyInterface(new FlyNoWay());
		setQuackInterface(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
