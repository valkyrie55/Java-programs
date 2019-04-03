//----------------1. Java Synchronized method------------------
package MyThread;

public class Sync2 {
    synchronized void  printTable(int n){ // printTable is a sharable resource thus it must be synchronized
    	for(int i=1;i<=5;i++){
    		System.out.println(n*i);
    		try{
    			Thread.sleep(400);
    		}
    		catch(Exception e){
    			System.out.println(e);
    		}
    	}
    }
}
class MyThread1  extends Thread{
	Sync2 obj;
	MyThread1(Sync2 obj){  //constructor
			this.obj = obj;
	}
	public void run(){
		obj.printTable(5);
	}
}

class MyThread2  extends Thread{
	Sync2 obj;
	MyThread2(Sync2 obj){  //constructor
			this.obj = obj;
	}
	public void run(){
		obj.printTable(100);
	}
}


/////////test class---------------

package MyThread;

//test class----------------------------
class TestSyn{
	public static void main(String[] args){
		Sync2 obj = new Sync2();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}





















