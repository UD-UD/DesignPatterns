package TheStrategyPattern.services;

import TheStrategyPattern.domain.QuackInterface;

public class Quack implements QuackInterface {
	public void quack() {
		System.out.println("Quack");
	}
}
