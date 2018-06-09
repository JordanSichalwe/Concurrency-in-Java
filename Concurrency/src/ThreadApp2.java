
public class ThreadApp2 implements Runnable {
	@Override
	public void run(){
		for(int i=0;i<=20;i++){
			System.out.println("Second Thread");
			if(i==5){
				System.out.println("middleway");
		}
			if(i==10){
				i=0;
				System.out.println("Last Value,reset done");
			}
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
