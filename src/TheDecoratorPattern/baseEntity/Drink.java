package TheDecoratorPattern.baseEntity;

/**
 * Created by ud on 22/3/17.
 */
public abstract class Drink {
    public String Description="AVCD";

    public String getGetDescription(){
        return Description;
    }

    public abstract double cost();

}
