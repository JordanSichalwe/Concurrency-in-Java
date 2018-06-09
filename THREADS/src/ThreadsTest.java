import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadsTest extends Thread{
	public static void main(String[]args){
		
		try{
	
		new Thread(
				new Runnable(){
					public void run(){
						int starPosition=5;
						int starNumber=1;
						for(int iteration=1;iteration<=5;iteration++){
							for(int print=1;print<=9;print++){
								if(print==starPosition){
									for(int num=1;num<=starNumber;num++){
								System.out.print("*");
									}
								}else{
									System.out.print(" ");
									
									}
								}
							if(starPosition==1){
								starPosition=5;
								System.out.println();
								for(int turn=1;turn<=4;turn++){
									for(int space=1;space<=4;space++){
										System.out.print(" ");
									}
									System.out.print("*");
									System.out.println();
										}
								}
							
							starPosition-=1;
							System.out.println();
							starNumber+=2;
						}
						
					}
				}
						
				).start();
		System.out.println();
		Thread1 t1 = new Thread1();
		t1.setPriority(MIN_PRIORITY);
		t1.join(10000);
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(t1);
        t1.wait();
        t1.notify();
    	System.out.println(t1.isAlive()?"true":"false");
    	
		}catch(Exception e){
			System.err.println();
		}
	}

}
