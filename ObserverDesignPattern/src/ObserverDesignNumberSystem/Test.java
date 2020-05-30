package ObserverDesignNumberSystem;

public class Test {
	public static void main(String args[]) {
		NumberData numberData = new NumberData();
		OctalDisplay octalDisplay = new OctalDisplay();
		HexDisplay hexDisplay = new HexDisplay();
		numberData.registerObserver(octalDisplay);
		numberData.registerObserver(hexDisplay);
		numberData.dataChange();
		numberData.dataChange();
	}
}
