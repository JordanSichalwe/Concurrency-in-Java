
public class SynchronizedBuffer  implements Buffer { 
	private int buffer = -1;
	// shared by producer and consumer threads 
	private boolean occupied = false;
	// place value into buffer
	{      // while there are no empty locations, place thread in waiting state 
		{ // output thread information and buffer information, then wait 
			System.out.println("Producer tries to write.");
			// for demo only
			displayState("Buffer full. Producer waits.");
			}
       displayState("Producer writes " + buffer);
       // for demo only
       } // end method blockingPut; releases lock on SynchronizedBuffer
	   // return value from buffer 
	{     // while no data to read, place thread in waiting state 
		while (!occupied) { // output thread information and buffer information, then wait
			System.out.println("Consumer tries to read.");
			// for demo only
			displayState("Buffer empty. Consumer waits.");
			// for demo 
			} 
		public synchronized void blockingPut(int value) throws InterruptedException{ 
		while (occupied) {
			wait();  
			buffer = value;
		// set new buffer value 
		// indicate producer cannot store another value
		// until consumer retrieves current buffer value
		occupied = true;
		notifyAll();
		}
		// tell waiting thread(s) to enter runnable state
		public synchronized int blockingGet() throws InterruptedException{
			wait();
		}
		// indicate that producer can store another value
		// because consumer just retrieved buffer value  
		occupied = false;
		
		}
	}
}
