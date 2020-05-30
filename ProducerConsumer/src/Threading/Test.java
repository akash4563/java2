package Threading;

public class Test {
	public static void main(String args[]) {
		Memory memory = new Memory();
		Thread threadProducer = new Thread(new Producer(memory));
		Thread threadConsumer = new Thread(new Consumer(memory));
		
		threadProducer.start();
		threadConsumer.start();
		
		try {
			threadProducer.join();
			threadConsumer.join();
		}
		catch(InterruptedException e) {}
	}
}
