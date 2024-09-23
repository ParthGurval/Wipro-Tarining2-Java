package practice.multithreading;

public class ThreadDemo {
	
	public static void main(String[] args) throws InterruptedException{
		
		 MyThread t1 = new MyThread();//Instantiation of a Thread
		 Thread t=new Thread();
//		 
//		 t1.start();//starting of a Thread
//
//		 for(int i = 0; i < 6; i++){
//			 
//			 System.out.println("main thread");
//			 
//		}
		
		
		//   o/p  auto change
		
//		main thread
//		main thread
//		main thread
//		main thread
//		Child Thread
//		Child Thread
//		Child Thread
//		Child Thread
//		Child Thread
//		Child Thread
//		main thread
//		main thread
		
//		MyRunnable r=new MyRunnable();
//		 
//		Thread t=new Thread(r);//here r is a Target Runnable
//		
//		Thread t1=new Thread();
//		Thread t2=new Thread(r);
//		
//		t1.start();
//		t2.start();
//
//		 for(int i=0;i<6;i++)
//		 {
//		 System.out.println("main thread");
//		 } 
		
	
//		System.out.println(Thread.currentThread().getName());//main
//		 MyThread t=new MyThread();
//		 System.out.println(t.getName());//Thread-0
//		 Thread.currentThread().setName("Parth's Thread");
//		 System.out.println(Thread.currentThread().getName());//Parth's Thread 
		 
//		 System.out.println(Thread.currentThread().getPriority());//5
//		 Thread.currentThread().setPriority(9);
//		 MyThread t=new MyThread();
//		 System.out.println(t.getPriority());//9 
		
		
		// Thread Join
		
		
		System.out.println("M");
		 Thread.sleep(3000);
		 System.out.println("E");
		 Thread.sleep(3000);
		 System.out.println("G");
		 Thread.sleep(3000);
		 System.out.println("A"); 

		 
	}

}
