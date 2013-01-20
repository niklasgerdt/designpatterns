package version2;

import java.util.ArrayList;

public class ObserverHandler implements Subject{
	private ArrayList<Observer> observers;
	
	public ObserverHandler(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer){
		observers.add(observer);
	}
	
	@Override
	public void unRegisterObserver(Observer observer){
		int i = observers.indexOf(observer);
		if (i >= 0){
			observers.remove(i);
		}
	}	
	
	@Override
	public void notifyObservers(ObserverNotifier notifier){
		for (Observer o : observers){
			notifier.notifyObserver(o);
		}
	}
}
