package practice.multithreading;

public class MyThread extends Thread {
	
	
	//   o/p - > Main Thread X 4
	//       - > Child Thread X 4

//	public void run() {
//		
//		for(int i = 0; i < 6; i++){
//			
//			System.out.println("Child Thread");
//		}
//	}
	
	// o/p   here values change auto
//	main thread
//	no arg method
//	main thread
//	main thread
//	main thread
//	main thread
	
//	public void run()
//	 {
//	 System.out.println("no arg method");
//	 }
//	 public void run(int i)
//	 {
//	 System.out.println("int arg method");
//	 } 
	
	
	//   o/p
	
//	start method
//	main thread
	
	public void start()
	 {
		System.out.println("start method");
	 }
	 public void run()
	 { 
		 System.out.println("run method");
	 }
	
} 


