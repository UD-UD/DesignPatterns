package TheStrategyPattern.services;

import TheStrategyPattern.domain.QuackInterface;

public class FakeQuack implements QuackInterface {
	public void quack() {
		System.out.println("Qwak");
	}
}
