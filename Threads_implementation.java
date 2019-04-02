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
    	//t1.run();
    }
}
