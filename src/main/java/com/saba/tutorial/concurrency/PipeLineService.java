/**
 * 
 */
package com.saba.tutorial.concurrency;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * @author chands
 */
public class PipeLineService extends BaseService {

   public PipeLineService(CountDownLatch latch, String svcName) {
      super(latch, svcName);
   }

   /*
    * (non-Javadoc)
    * @see com.saba.tutorial.concurrency.BaseService#verifyService()
    */
   @Override
   public void verifyService() {
      System.out.println("Verify Pipeline Service at " + new Date());

      System.out.println("Pipeline Svc completed at " + new Date());
   }

}
