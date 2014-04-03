/**
 * 
 */
package com.saba.tutorial.concurrency;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * @author chands
 */
public class StatementService extends BaseService {

   public StatementService(CountDownLatch latch, String svcName) {
      super(latch, svcName);
   }

   /*
    * (non-Javadoc)
    * @see com.saba.tutorial.concurrency.BaseService#verifyService()
    */
   @Override
   public void verifyService() {
      System.out.println("Verify Statement Service started at " + new Date());
      try {
         Thread.sleep(8000);
      } catch (InterruptedException e) {
         System.out.println("Error in Statement Service");
      }
      System.out.println("Statement Svc completed at " + new Date());

   }

}
