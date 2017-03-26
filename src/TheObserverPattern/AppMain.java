package TheObserverPattern;

import TheObserverPattern.Object.CurrentConditionsDisplay;
import TheObserverPattern.Object.ForecastDisplay;
import TheObserverPattern.Object.StatisticsDisplay;
import TheObserverPattern.Subject.Subject;
import TheObserverPattern.Subject.SubjectIMPL;

/**
 * Created by ud on 22/3/17.
 */
public class AppMain {
    public static void main(String args[]){

            SubjectIMPL weatherData = new SubjectIMPL();

            CurrentConditionsDisplay currentDisplay =
                    new CurrentConditionsDisplay(weatherData);
            StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
            ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

            weatherData.setMeasurements(80, 65, 30.4f);
            weatherData.setMeasurements(82, 70, 29.2f);
            weatherData.setMeasurements(78, 90, 29.2f);

    }
}
