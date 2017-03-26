package TheObserverPattern.Subject;

import TheObserverPattern.Object.ObjectClass;

/**
 * Created by ud on 22/3/17.
 */
public interface Subject {
    public void registerObserver(ObjectClass o);
    public void removeObserver(ObjectClass o);
    public void notifyObservers();
}