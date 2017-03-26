package TheStrategyPattern;

import TheObserverPattern.Object.CurrentConditionsDisplay;
import TheObserverPattern.Object.ForecastDisplay;
import TheObserverPattern.Object.StatisticsDisplay;
import TheObserverPattern.Subject.SubjectIMPL;
import TheStrategyPattern.model.DecoyDuck;
import TheStrategyPattern.model.MallardDuck;
import TheStrategyPattern.model.Model;
import TheStrategyPattern.services.FlyRocketPowered;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();

		DecoyDuck decoy = new DecoyDuck();
 
		Model model = new Model();

		mallard.performQuack();

		decoy.performQuack();
   
		model.performFly();	
		model.setFlyInterface(new FlyRocketPowered());
		model.performFly();

	}
}
