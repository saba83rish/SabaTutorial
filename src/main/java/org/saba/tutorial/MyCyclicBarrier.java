package org.saba.tutorial;

import java.util.Date;
import java.util.concurrent.CyclicBarrier;

/**
 * @author ShabbuDhee
 *
 */
public class MyCyclicBarrier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//quick way to make thread
		Runnable barrier1Action = new Runnable() {
		    public void run() {
		    	try {
		    		System.out.println("BarrierAction 1 started "+ new Date());
					Thread.sleep(1000);
					System.out.println("BarrierAction 1 executed "+new Date());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		    }
		};
		
		Runnable barrier2Action = new Runnable() {
		    public void run() {
		    	try {
		    		System.out.println("BarrierAction 2 started "+ new Date());
					Thread.sleep(1000);
					System.out.println("BarrierAction 2 executed "+new Date());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		    }
		};
		//pass the thread barries to the cyclic barrier
		CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);
		CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action);
		CyclicBarrier barrier3 = new CyclicBarrier(2);
		
		//thread class implemeneting runnable made by me
		CyclicBarrierRunnable barrierRunnable1 =
		        new CyclicBarrierRunnable(barrier1, barrier2,barrier3);

		CyclicBarrierRunnable barrierRunnable2 =
		        new CyclicBarrierRunnable(barrier1, barrier2,barrier3);
		
		new Thread(barrierRunnable1).start();
		new Thread(barrierRunnable2).start();

	}

}
