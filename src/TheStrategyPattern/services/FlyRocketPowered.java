package TheStrategyPattern.services;

import TheStrategyPattern.domain.FlyInterface;

public class FlyRocketPowered implements FlyInterface {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
