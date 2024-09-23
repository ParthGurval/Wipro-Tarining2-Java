package practice.multithreading;

public class MyRunnable implements Runnable {
		
		 public void run() {
				
				for(int i = 0; i < 6; i++){
					
					System.out.println("Child Thread");
				}
			}
	

}
