
public class NewThread extends Thread {
	
	public void run(){
		int i=3;
		while(i<30){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("whats up");
			i++;
		}
	}

}
