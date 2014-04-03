/**
 * 
 */
package com.saba.tutorial.concurrency;

import java.util.concurrent.CountDownLatch;

/**
 * @author chands
 */
public abstract class BaseService implements Runnable {

   private final CountDownLatch _latch;
   private final String _serviceName;
   private boolean _serviceUp;

   public BaseService(CountDownLatch latch, String serviceName) {
      super();
      this._latch = latch;
      this._serviceName = serviceName;
      this._serviceUp = false;
   }

   /*
    * (non-Javadoc)
    * @see java.lang.Runnable#run()
    */
   public void run() {

      try {
         verifyService();
         _serviceUp = true;
      } catch (Throwable t) {
         t.printStackTrace(System.err);
         _serviceUp = false;
      } finally {
         if (_latch != null) {
            System.out.println("Latch count in " + "service " + get_serviceName() + _latch.getCount());
            _latch.countDown();
         }
      }

   }

   public abstract void verifyService();

   /**
    * @return the _latch
    */
   public CountDownLatch get_latch() {
      return _latch;
   }

   /**
    * @return the _serviceName
    */
   public String get_serviceName() {
      return _serviceName;
   }

   /**
    * @return the _serviceUp
    */
   public boolean is_serviceUp() {
      return _serviceUp;
   }

}
