package TheStatePattern.states;

/**
 * Created by ud on 23/3/17.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
