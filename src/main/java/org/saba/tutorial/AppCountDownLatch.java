package org.saba.tutorial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.saba.tutorial.concurrency.BaseService;
import com.saba.tutorial.concurrency.DocumentsService;
import com.saba.tutorial.concurrency.PipeLineService;
import com.saba.tutorial.concurrency.StatementService;

/**
 * Hello world!
 */
public class AppCountDownLatch {
   // List of service checkers
   private static List<BaseService> servicesList;

   // This latch will be used to wait on
   private static CountDownLatch latch;

   public static void main(String[] args) {
      System.out.println("Hello World!");
      latch = new CountDownLatch(3);

      servicesList = new ArrayList<BaseService>();
      servicesList.add(new PipeLineService(latch, "PipeLine Services"));
      servicesList.add(new DocumentsService(latch, "Document Services"));
      servicesList.add(new StatementService(latch, "Statement Services"));

      ExecutorService execSvc = Executors.newFixedThreadPool(servicesList.size());

      for (BaseService b : servicesList) {
    	  //System.out.println("Latch count BEFORE execute" + latch.getCount());
         execSvc.execute(b);
         //System.out.println("Latch count after execute" + latch.getCount());
      }

      try {
         System.out.println(new Date()+"Latch count before await" + latch.getCount());
         latch.await();
         System.out.println("after latch await"+new Date());
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      System.out.println("Before executor shutdown");
      execSvc.shutdown();
      System.out.println("Services are run successfully");
   }
}
