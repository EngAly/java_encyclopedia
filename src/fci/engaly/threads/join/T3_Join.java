package fci.engaly.threads.join;

/**
 * -----------------------------------Yield()<br>
 * method will stop the currently executing thread and give a chance to another
 * thread of same priority which are waiting in queue. If thier is no thread
 * then current thread will continue to execute. CPU will never be in ideal
 * state.Both are static menthod.Yield ,Sleep()
 * 
 */
public class T3_Join extends Thread {

	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		System.out.println(t.getName());
	}

	public static void main(String[] args) {
		T3_Join t1 = new T3_Join();
		T3_Join t2 = new T3_Join();
		t2.start();

		try {
//			Join : t1 and t2 are two threads , t2.join() is called then t1 enters into wait state until t2
//			completes execution. Then t1 will into runnable state then our specialist JVM thread scheduler 
//			will pick t1 based on criteria's.
			t2.join(); // Waiting for c1 to finish

		} catch (Exception ie) {
		}
		t1.start();

	}
}
