package fci.engaly.threads.yield;

/**
 * yield:() indicates that the thread is not doing anything particularly
 * important and if any other threads or processes need to be run, they
 * can.Otherwise, the current thread will continue to run.<br>
 * 
 * 1) Remember that all the threads carry normal priority when a priority is not
 * specified<br>
 * 2) Priorities can be specified from 1 to 10. 10 being the highest, 1 being
 * the lowest priority and 5 being the normal priority.<br>
 * 3) setPriority() can be used to set the priorities for the threads.<br>
 * 4) can use the constants, MIN_PRIORITY,MAX_PRIORITY and NORM_PRIORITY for
 * setting priorities. <br>
 * 
 * -------------------------------------yield()<br>
 * method pauses the currently executing thread temporarily for giving a chance
 * to the remaining waiting threads of the same priority to execute. If there is
 * no waiting thread or all the waiting threads have a lower priority then the
 * same thread will continue its execution.
 */
public class T1_Yield {
	public static void main(String[] args) {
		Thread producer = new Producer();
		Thread consumer = new Consumer();

		producer.setPriority(Thread.MIN_PRIORITY); // Producer is set to minimum priority
		consumer.setPriority(Thread.MAX_PRIORITY); // consumer is set to maximum priority

		producer.start();
		consumer.start();
	}
}

class Producer extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Producer : Produced Item " + i);
//			Theoretically, to ‘yield’ means to let go, to give up, to surrender.
//			A yielding thread tells the virtual machine that it’s willing to let other threads be scheduled in its place
//			Yield is a Static method and Native too.
//			Yield tells the currently executing thread to give a chance to the threads that have equal priority in the Thread Pool.

			Thread.yield();
		}
	}
}

class Consumer extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Consumer : Consumed Item " + i);
//			Thread.yield();
		}
	}
}