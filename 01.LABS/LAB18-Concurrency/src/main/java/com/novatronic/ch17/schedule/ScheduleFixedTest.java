/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17.schedule;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Omar
 */
public class ScheduleFixedTest {
    private static final Logger LOG = LoggerFactory.getLogger(ScheduleFixedTest.class);
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(20);
        Runnable task1 = () -> {
            LOG.info("Hello Zoo - start");
            waitfor(1000);
            LOG.info("Hello Zoo - end");};
        Runnable task2 = () -> {
            LOG.info("Hello Monkey - start");
            waitfor(1000);
            LOG.info("Hello Monkey");
            LOG.info("Hello Monkey - end");};
            
        ScheduledFuture<?> r1 = service.scheduleAtFixedRate(task1, 2, 5, TimeUnit.SECONDS);
        ScheduledFuture<?> r2 = service.scheduleAtFixedRate(task2, 5, 10, TimeUnit.SECONDS);
        
        LOG.info("...wait");
        LOG.info("r1:" + r1.get(1, TimeUnit.MINUTES));
        LOG.info("r2:" + r2.get(1, TimeUnit.MINUTES));
        LOG.info("...done");
        
        service.shutdown();
    }
    
    private static void waitfor(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            LOG.error("EX:Interrupted", ex);
        }
    }
}
