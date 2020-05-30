package Threading;

public class Producer implements Runnable{
	Memory memory;
	public Producer(Memory memory) {
		this.memory=memory;
	}
	
	public void run() {
		while(true) {
			try {
				memory.produce();
			}
			catch(InterruptedException e) {}
		}
	}
}	
