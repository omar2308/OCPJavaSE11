/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Omar
 */
public class ZooInfo {
    private static final Logger LOG = LoggerFactory.getLogger(ZooInfo.class);
   public static void main(String[] args) {
      ExecutorService service = null;
      Runnable task1 = () -> LOG.info("Printing zoo inventory");
      Runnable task2 = () -> {for(int i = 0; true; i++)
            LOG.info("Printing record: "+i);};
      try {
         service = Executors.newSingleThreadExecutor();
         LOG.info("begin");
         service.execute(task1);
         service.execute(task2);
         service.execute(task1);
         LOG.info("end");
      } finally {
         if(service != null) service.shutdownNow();
      }
   }
}
