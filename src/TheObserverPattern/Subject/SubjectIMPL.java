package TheObserverPattern.Subject;

import TheObserverPattern.Object.ObjectClass;
import TheObserverPattern.Subject.Subject;

import java.util.ArrayList;

/**
 * Created by ud on 22/3/17.
 */
public class SubjectIMPL implements Subject {
    private ArrayList<ObjectClass> objectClassArrayList;
    private float temperature;
    private float humidity;
    private float pressure;

    public SubjectIMPL() {
        objectClassArrayList = new ArrayList<ObjectClass>();
    }

    public void registerObserver(ObjectClass o) {
        objectClassArrayList.add(o);
    }

    public void removeObserver(ObjectClass o) {
        int i = objectClassArrayList.indexOf(o);
        if (i >= 0) {
            objectClassArrayList.remove(i);
        }
    }
    
    /*
    Funtion to all obeserver about the change
     */

    public void notifyObservers() {
        for (int i = 0; i < objectClassArrayList.size(); i++) {
            ObjectClass ObjectClass = (ObjectClass)objectClassArrayList.get(i);
            ObjectClass.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    /*
    * Sets new Data and call a function to update/notify all obeserver*/

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
