package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	public void subscribe(Observer o) {
		observers.add(o);
	}
	public void unsubscribe(Observer o) {
		observers.remove(o);
	}
	public void notifySub() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	public void measurementsChanged() {
		notifySub();
	}
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.setTemperature(temperature);
		this.setHumidity(humidity);
		this.setPressure(pressure);
		measurementsChanged();
	}
	public float getTemperature() {
		// TODO Auto-generated method stub
		return this.temperature;
	}
	public float getPressure() {
		return pressure;
	}
	private void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getHumidity() {
		return humidity;
	}
	private void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	private void setTemperature(float temperature) {
		this.temperature = temperature;
	}

}
