package ObserverDesignNumberSystem;
import java.util.*;

public class NumberData implements Subject{
	int number;
	ArrayList<Observer> observerList;
	public NumberData() {
		observerList = new ArrayList<Observer>();
	}
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}
	public void notifyObserver(int num) {
		for(Iterator<Observer> iterator = observerList.iterator(); iterator.hasNext(); ) {
			Observer observer = iterator.next();
			observer.update(num);
		}
	}
	public void dataChange() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number bitch!");
		number = scanner.nextInt();
		notifyObserver(number);
		scanner.close();
	}
}
