
public class UnsynchronizedBuffer implements Buffer {
	private int buffer=-1;
	public void blockingPut(int value) throws InterruptedException{
		System.out.printf("Producer writes %2d",value);
		buffer = value;
	}
	public int blockingGet() throws InterruptedException{
		System.out.printf("Customer reads \t%2d",buffer);
		return buffer;
		
	}

}
