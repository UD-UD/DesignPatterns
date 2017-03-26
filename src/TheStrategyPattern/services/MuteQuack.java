package TheStrategyPattern.services;

import TheStrategyPattern.domain.QuackInterface;

public class MuteQuack implements QuackInterface {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
