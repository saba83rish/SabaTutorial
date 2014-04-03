package org.saba.tutorial;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author ShabbuDhee
 *
 */
public class CyclicBarrierRunnable implements Runnable {
	
	CyclicBarrier barrier1 = null;
    CyclicBarrier barrier2 = null;
    CyclicBarrier barrier3 = null;
    
	CyclicBarrierRunnable(CyclicBarrier cb1, CyclicBarrier cb2, CyclicBarrier cb3) {
		barrier1=cb1;
		barrier2=cb2;
		barrier3=cb3;
	}


	 public void run() {
	        try {
	            Thread.sleep(1000);
	            System.out.println(Thread.currentThread().getName() +
	            		" waiting at barrier 1");
	            System.out.println("called await");
	            this.barrier1.await();
	            System.out.println(Thread.currentThread().getName() +
	            		" waiting at barrier 1");
	            System.out.println("sleep 1 sec");
	            Thread.sleep(1000);
	            System.out.println(Thread.currentThread().getName() +
	                                " waiting at barrier 2");
	            this.barrier2.await();

	            System.out.println(Thread.currentThread().getName() +
	                                " done!");
	            System.out.println("called await again");
	            System.out.println(Thread.currentThread().getName() +
                        " waiting at barrier 3");
	            this.barrier3.await();

	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } catch (BrokenBarrierException e) {
	            e.printStackTrace();
	        }
	    }

}
