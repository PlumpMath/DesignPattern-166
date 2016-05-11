package com.silva.observer;

public class ObserverTest {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay c = new CurrentConditionsDisplay(weatherData);
		c.register();
		weatherData.setWeatherData(1.0f, 1.0f, 1.0f);

	}

}
