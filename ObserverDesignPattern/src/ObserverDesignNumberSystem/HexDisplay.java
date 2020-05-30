package ObserverDesignNumberSystem;

public class HexDisplay implements Observer {
	public void update(int number) {
		System.out.println("Hex e bhai Hex e ="+number);
	}
}
