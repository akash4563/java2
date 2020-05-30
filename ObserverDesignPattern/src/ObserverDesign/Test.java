package ObserverDesign;

public class Test {
	public static void main(String args[]) {
		CricketData cricketData = new CricketData();
		
		CurrentScore currentScore = new CurrentScore();
		AverageScore averageScore = new AverageScore();
		
		cricketData.registerObserver(currentScore);
		cricketData.registerObserver(averageScore);
		
		cricketData.dataChanged();
		cricketData.dataChanged();
	}
}
