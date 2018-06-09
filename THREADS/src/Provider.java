
public class Provider implements Runnable{
	private final Operations op;
	public Provider(Operations op){
		this.op=op;
	}
	public void run(){
		int num=1;
		while(num<=20||num>=0){
			try {
				op.sum(num);
				System.out.println(num);
				num++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}
			
}


