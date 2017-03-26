package TheStrategyPattern.services;

import TheStrategyPattern.domain.FlyInterface;

public class FlyWithWings implements FlyInterface{
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
