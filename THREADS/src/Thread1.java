
public class Thread1 extends Thread implements Runnable {
	int[][]numbers= new int[4][5];
	@Override
	public void run(){
		for(int row=0;row<numbers.length;row++){
			for(int column=0;column<numbers[row].length;column++){
				if(column!=4){
				System.out.print((row+1)+","+(column+1)+"  ");
				}else if(column==4){
					System.out.print((row+1)+","+(column+1)+"  ");
					System.out.println();
				}
				try{
					Thread.sleep(2000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
			
		}
	}

}
