package version1;

import java.util.ArrayList;

public class Name implements Subject{
	private ArrayList<Observer> observers;
	private String name;
	
	public Name(){
		observers = new ArrayList<Observer>();
	}
	
	public void setName(String _name){
		name = _name;
		notifyObservers();
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
	public void notifyObservers(){
		for (Observer o : observers){
			o.update(name);
		}
	}
}
