import java.sql.*;
public class ThreadApp {
	public static void main(String[]args){
		try{
			ThreadCreate myThread = new ThreadCreate();
			Thread myT = new Thread(new ThreadApp2());
		myThread.start();
		myT.start();
		new Thread(
				new Runnable(){
				public void run(){
				int count=1;
				while(count<10){
					System.out.println("Inner thread");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count++;
				}
				myT.suspend();
				}
				}
				).start();
		
		myT.setPriority(Thread.MAX_PRIORITY);
		myThread.setPriority(Thread.NORM_PRIORITY);
		try{
			myThread.join();
		}catch(InterruptedException e1){
			e1.printStackTrace();
		}
	
	}catch(Exception e){
		System.err.println(e);
	}
}

}
