package TheStrategyPattern.services;

import TheStrategyPattern.domain.QuackInterface;

public class Squeak implements QuackInterface {
	public void quack() {
		System.out.println("Squeak");
	}
}
