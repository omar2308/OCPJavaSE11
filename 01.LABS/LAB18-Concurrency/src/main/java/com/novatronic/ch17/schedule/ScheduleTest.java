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
public class ScheduleTest {
    private static final Logger LOG = LoggerFactory.getLogger(ScheduleTest.class);
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () 
                -> LOG.info("Hello Zoo");
        Callable<String> task2 = () -> {
            LOG.info("Hello Monkey");
            return "Monkey";};
        ScheduledFuture<?> r1 = service.schedule(task1, 5, TimeUnit.SECONDS);
        ScheduledFuture<String> r2 = service.schedule(task2, 25, TimeUnit.SECONDS);
        
        LOG.info("...wait");
        LOG.info("r1:" + r1.get(1, TimeUnit.MINUTES));
        LOG.info("r2:" + r2.get(1, TimeUnit.MINUTES));
        LOG.info("...done");
        
        service.shutdown();
    }
}
