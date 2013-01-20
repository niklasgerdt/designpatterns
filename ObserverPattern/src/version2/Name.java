package version2;

public class Name implements ObserverNotifier{
	private ObserverHandler observerHandler;
	private String name;
	
	public Name(){
		observerHandler = new ObserverHandler(); 
	}
	
	public ObserverHandler getObserverHandler(){
		return observerHandler;
	}
	
	public void setName(String _name){
		name = _name;
		observerHandler.notifyObservers(this);
	}

	@Override
	public void notifyObserver(Observer observer) {
		observer.update(name);
	}
}
