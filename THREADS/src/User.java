
public class User implements Runnable{
	private final Operations op;
	public User(Operations op){
		this.op=op;
	}
	public void run(){
		
		try{
			int num=20;
			while(num!=0||num>0||num<=20){
			num=op.diff(num);
			System.out.println(num);
			}
			System.out.print("All resources were used up");
		}catch(InterruptedException ex){
			ex.printStackTrace();
			Thread.currentThread().interrupt();
		}
	
	}

}
