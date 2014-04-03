/**
 * 
 */
package com.saba.tutorial.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author chands
 */
public class CyclicBarrierTask implements Runnable {
   private final CyclicBarrier barrierRef;

   public CyclicBarrierTask(CyclicBarrier barrier) {
      this.barrierRef = barrier;
   }

   public void run() {

      System.out.println("Start of Run Method with " + Thread.currentThread().getName());
      try {
         synchronized (barrierRef) {
            System.out.println("Inside synchronized barrier to call notify");
            System.out.println(Thread.currentThread().getName());
            barrierRef.notifyAll();
            System.out.println("Called Notify");
         }
         System.out.println("before calling cyclic barrier await");
         int awaitInt = barrierRef.await();
         System.out.println("Arrival Index of the current thread is " + awaitInt);
      } catch (InterruptedException e) {
         System.out.println("Interrupted Exception in " + Thread.currentThread().getName());
      } catch (BrokenBarrierException e) {
         System.out.println("Broken Barrier Exception in " + Thread.currentThread().getName());
      }

   }

}
