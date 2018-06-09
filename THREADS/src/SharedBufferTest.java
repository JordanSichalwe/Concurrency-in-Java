import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest {
public static void main(String[]args){
	try{
	ExecutorService executor = Executors.newFixedThreadPool(4);
	Buffer sharedLocation = new UnsynchronizedBuffer();
	
	executor.execute(new Producer(sharedLocation));
	executor.execute(new Consumer(sharedLocation));
	   System.out.println("Action\t\tValue\tSum of Produced\tSum of Consumed");      
	   System.out.printf("------\t\t-----\t---------------\t---------------%n%n");
	executor.shutdown();
	executor.awaitTermination(1,TimeUnit.MINUTES);
	}catch(Exception e){
		System.err.println(e + "found");
	}
}
}
