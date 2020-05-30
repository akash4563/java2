package Threading;
import java.util.*;
public class Memory {
	int buffer = 3;
	ArrayList<Integer> arrayList = new ArrayList<Integer>(buffer);
	public synchronized void produce() throws InterruptedException {
		int job = 0;
		while(true) {
				while(arrayList.size()==buffer) {
					wait();
				}
				System.out.println("Output of Job "+job+" Produced");
				arrayList.add(job);
				job++;
				notify();
				Thread.sleep(1000);	
		}
}
	public synchronized void consume() throws InterruptedException {
		while(true) {
				while(arrayList.size() == 0) {
					wait();
				}
				System.out.println("Output of job "+arrayList.remove(0)+" Consumed");
				notify();										
				Thread.sleep(1000);
		}
		
	}
}


