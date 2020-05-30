package ObserverDesignNumberSystem;

public interface Subject {
	public void registerObserver(Observer observer);
	public void notifyObserver(int number);
}
