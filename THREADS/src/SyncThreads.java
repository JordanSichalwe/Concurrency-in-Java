
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncThreads extends Thread{
public static int total;
public static void main(String[]args){
	ExecutorService executor = Executors.newCachedThreadPool();
	
	ThreadClass thread = new ThreadClass();
	total=20;
	executor.execute(thread);
	executor.shutdown();
	
	 	
}


}
class ThreadClass implements Runnable{

public static int diff(){
	int diff= SyncThreads.total;
	while(diff>=1){
		System.out.println(diff);
	diff -= 2;
	
	}
	return diff;
}
	@Override 
	public void run(){
		try{
			Thread.sleep(2000);
		System.out.println(diff()!=0?diff():"TASK COMPLETE");
		if(diff()==0){
			Thread.yield();
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
}
