/**
 * 
 */
package com.saba.tutorial.concurrency;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * @author chands
 */
public class DocumentsService extends BaseService {

   public DocumentsService(CountDownLatch latch, String svcName) {
      super(latch, svcName);
   }

   /*
    * (non-Javadoc)
    * @see com.saba.tutorial.concurrency.BaseService#verifyService()
    */
   @Override
   public void verifyService() {
      System.out.println("Verify Documents Service started at " + new Date());

      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {

         System.out.println("error in document service");
      }

      System.out.println("Documents Svc completed at " + new Date());

   }

}
