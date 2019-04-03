//------------------2. Synchronization block by: a) extending Thread -----------------
package MyThread;
//    1. Method Synchronization using anonymous class---------------
public class Sync2 {
     void  printTable(int n){ // printTable is a sharable resource thus it must be synchronized
    	 synchronized(this){
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
}
class MyThread1 extends Thread{
	Sync2 obj;
	MyThread1(Sync2 obj){
		this.obj = obj;
	}
	public void run(){
		obj.printTable(5);
	}
}

class MyThread2 extends Thread{
	Sync2 obj;
	MyThread2(Sync2 obj){
		this.obj = obj;
	}
	public void run(){
		obj.printTable(100);
	}
}

//-----------------Testclass file--------------
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
//------------------2. Synchronization block by: a) Asynchronous class -----------------
package MyThread;
//    1. Method Synchronization using anonymous class---------------
public class Sync2 {
     void  printTable(int n){ // printTable is a sharable resource thus it must be synchronized
    	 synchronized(this){
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
}
//test file:
package MyThread;

//test class----------------------------
class TestSyn{
	public static void main(String[] args){
		final Sync2 obj = new Sync2();
        Thread t1 = new Thread(){
        	public void run(){
        		obj.printTable(5);
        	}
        };
        Thread t2 = new Thread(){
        	public void run(){
        		obj.printTable(5);
        	}
        };
        t1.start();
		t2.start();
	}
}