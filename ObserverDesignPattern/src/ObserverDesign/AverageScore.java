package ObserverDesign;

public class AverageScore implements Observer{
	float runRate;
	public void update(int runs, int wicket, float overs) {
		runRate=(float)runs/overs;
		System.out.println("Runrate = "+runRate);
	}
}
