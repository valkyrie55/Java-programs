////Extending the Thread class and achieving multithreading
// 1st method
public class MyThread extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(i);
		}
	}
    public static void main(String[] args){
    	MyThread t1 = new MyThread();
    	MyThread t2 = new MyThread();
    	MyThread t3 = new MyThread();

    	t1.start();
    	t2.start();
    	t3.start();
    	t1.run();
    	t2.run();
    	t3.run();
    	System.out.println("Bye");
    	t1.run();
    }
}
//-------------Method 2---Ny Implementing Runnable----------
public class MyThread implements Runnable{   //2nd method
	public void run(){
		for(int i=0;i<100;i++){
			
			System.out.println(i);
		}
	}
    public static void main(String[] args){
    	MyThread obj = new MyThread();
    	Thread t1 = new Thread(obj);
    	Thread t2 = new Thread(obj);
    	Thread t3 = new Thread(obj);
    	t1.start();
    	t2.start();
    	t3.start();
    	t1.run();
    	t2.run();
    	t3.run();
    	System.out.println("Its over");
    }
}
//-----------------If MyThread extends another class 'gumnam' then we've 2 choice to create threads that perform different 
//  functions------
// 1> Implement Runnable and use anonymous inner class

public class MyThread extends gumnam implements Runnable{
	public static void main(String[] args){
		MyThread obj = new MyThread();
		Thread t1 = new Thread(obj){
			public void run(){   //run() for thread t1
				for(int i=0;i<100;i++){
					System.out.println(i);
				}
			}
				
		};
		Thread t2 = new Thread(obj){
			public void run(){   //run() for thread t2
				for(int i=0;i<10;i++){
					System.out.println("Hello ji " +i);
				}
			}
		};
		Thread t3 = new Thread(obj){
			public void run(){   //run() for thread t3
				for(int i=0;i<10;i++){
					System.out.println("Suno ji " +i);
				}
			}
		};
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Bye");
}
}

//-------------2. Create a new class and create an object of the previous class--------------

