package ObserverDesign;

public class CurrentScore implements Observer{
	public void update(int runs, int wickets, float overs) {
		System.out.println("Runs = "+runs+"\nWickets = "+wickets+"\nOvers = "+overs);
	}
}
