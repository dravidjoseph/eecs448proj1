

public class ClockTest{
	
	
	public static void main(String[] args){
		
		int i = 0;
		
		while(true){
			System.out.print("\033[H\033[2J");
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
			i++;
			
			
		}
		
		
		
	}
	
	
	
	
}