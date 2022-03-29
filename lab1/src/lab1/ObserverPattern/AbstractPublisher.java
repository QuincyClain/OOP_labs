package lab1.ObserverPattern;

import java.util.ArrayList;

public interface AbstractPublisher {
	static ArrayList<Observer> observers = new ArrayList<Observer>();
	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
