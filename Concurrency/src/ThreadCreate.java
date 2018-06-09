
public class ThreadCreate extends Thread {
	@Override
		public void run(){
			while(true){
				System.out.println("this is a thread start");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		
	}

}
