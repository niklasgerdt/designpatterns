package version2;

public interface Subject {
	public void registerObserver(Observer observer);
	public void unRegisterObserver(Observer observer);
	void notifyObservers(ObserverNotifier notifier);
}
