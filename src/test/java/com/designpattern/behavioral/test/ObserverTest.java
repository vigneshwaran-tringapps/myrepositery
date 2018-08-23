package com.designpattern.behavioral.test;

import org.junit.Test;

import com.designpattern.behavioral.observer.CurrentConditionsDisplay;
import com.designpattern.behavioral.observer.ForecastDisplay;
import com.designpattern.behavioral.observer.Observer;
import com.designpattern.behavioral.observer.StatisticsDisplay;
import com.designpattern.behavioral.observer.Subject;
import com.designpattern.behavioral.observer.WeatherData;

public class ObserverTest {
	
	@Test
	public void observerTest(){
		
		WeatherData weatherData = new WeatherData();
		
		Observer currentDisplay = 
				new CurrentConditionsDisplay(weatherData);
		Observer statisticsDisplay = new StatisticsDisplay(weatherData);
		Observer forecastDisplay = new ForecastDisplay(weatherData);

			weatherData.setMeasurements(80, 65, 30.4f);
			weatherData.setMeasurements(82, 70, 29.2f);
			weatherData.setMeasurements(78, 90, 29.2f);
		
	}

}
