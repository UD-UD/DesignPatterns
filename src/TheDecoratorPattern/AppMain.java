package TheDecoratorPattern;

import TheDecoratorPattern.MainEntities.Coffee;
import TheDecoratorPattern.MainEntities.Juice;
import TheDecoratorPattern.baseEntity.Drink;
import TheDecoratorPattern.decorators.Milk;
import TheDecoratorPattern.decorators.Mocha;

/**
 * Created by ud on 22/3/17.
 */
public class AppMain {

    public static void main(String args[]){
        Drink d=new Coffee();
        Drink d2=new Juice();
        System.out.println(d2.getGetDescription()+" "+d2.cost());

        Drink milk=new Milk(d);
        Drink mocha = new Mocha(milk);

        System.out.println(d.getGetDescription()+" Coff "+d.cost());

        System.out.println(milk.getGetDescription()+" mil "+milk.cost());

        System.out.println(mocha.getGetDescription()+" mocha "+mocha.cost());
    }
}
