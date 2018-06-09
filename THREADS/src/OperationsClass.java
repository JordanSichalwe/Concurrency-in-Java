
public class OperationsClass implements Operations{
	private int val1;

	public void sum(int val) throws InterruptedException{
		val1=diff(val);
	}
	public int diff(int val) throws InterruptedException{
		val=val1;
		val-=2;
		return val;
	}

}
