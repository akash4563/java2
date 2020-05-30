package ObserverDesign;
import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.Scanner;

public class CricketData implements Subject{
	int runs, wickets;
	float overs;
	ArrayList<Observer> observerList;
	public CricketData() {
		observerList = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}
	public void unregisterObserver(Observer observer) {
		observerList.remove(observer);
	}
	
	public void notifyObservers() {
		for(Iterator<Observer> iterator=observerList.iterator();iterator.hasNext();) {
			Observer observer = iterator.next();
			observer.update(runs,wickets,overs);
		}
	}
	public void dataChanged() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Runs, wickets, overs");
		runs = scanner.nextInt();
		wickets = scanner.nextInt();
		overs = scanner.nextFloat();
		notifyObservers();
	}
}
