import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class User_ProviderTest {
	public static void main(String[]args){
		Operations op = new OperationsClass();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		try{
		executor.execute(new User(op));
		executor.execute(new Provider(op));
		
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Somethign went wrong check your code");
		}
	}

}
