package TheStrategyPattern.services;

import TheStrategyPattern.domain.FlyInterface;

public class FlyNoWay implements FlyInterface {
	public void fly() {
		System.out.println("I can't fly");
	}
}
