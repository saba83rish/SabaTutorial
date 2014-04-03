/**
 * 
 */
package org.saba.tutorial;

import java.util.concurrent.CyclicBarrier;

import com.saba.tutorial.concurrency.CyclicBarrierTask;

/**
 * @author chands
 */
public class AppCyclicBarrier {

   public static void main(String args[]) {

      final CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {

         public void run() {
            System.out.println("Created a cyclic barrier for 3 threads");

         }
      });

      Thread t1 = new Thread(new CyclicBarrierTask(cb), "Thread UNO");
      Thread t2 = new Thread(new CyclicBarrierTask(cb), "Thread DOS");
      Thread t3 = new Thread(new CyclicBarrierTask(cb), "Thread TRES");

      System.out.println("Start Thread 1");
      t1.start();
      System.out.println("Start Thread 2");
      t2.start();
      System.out.println("Put a wait on thread 1");
      synchronized (cb) {

         try {
            System.out.println("Calling cyclic barrier wait");
            System.out.println(Thread.currentThread().getName());
            cb.wait();
            System.out.println("Cyclic barrier wait is over");

         } catch (InterruptedException e) {
            e.printStackTrace();
         }

      }
      System.out.println("After synchronized block");
      System.out.println("Start Thread 3");
      t3.start();
   }

}
