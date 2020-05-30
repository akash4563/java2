package Threading;

public class Consumer implements Runnable{
	Memory memory;
	public Consumer(Memory memory) {
		this.memory=memory;
	}
	
	public void run() {
		while(true) {
			try {
				memory.consume();
			}
			catch(InterruptedException e) {}
		}
	}
}
