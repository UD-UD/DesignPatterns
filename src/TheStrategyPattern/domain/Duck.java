package TheStrategyPattern.domain;

/**
 * Created by ud on 21/3/17.
 */
public abstract class Duck {
    public FlyInterface flyInterface;             //Injecting fly behavious
    public QuackInterface quackInterface;          //Injecting quack Behaviour

    public FlyInterface getFlyInterface() {
        return flyInterface;
    }

    public void setFlyInterface(FlyInterface flyInterface) {
        this.flyInterface = flyInterface;
    }

    public QuackInterface getQuackInterface() {
        return quackInterface;
    }

    public void setQuackInterface(QuackInterface quackInterface) {
        this.quackInterface = quackInterface;
    }

    public void performFly() {
        flyInterface.fly();
    }

    public void performQuack() {
        quackInterface.quack();
    }

    /*
    Common behaviour swim
     */
    public void swim(){
        System.out.print("I can swim");
    }
    public abstract void display();
}
