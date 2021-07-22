/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17.submit;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Omar
 */
public class InvokeAllTest {
    private static final Logger LOG = LoggerFactory.getLogger(InvokeAllTest.class);
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        LOG.info("begin");
        Callable<String> task = () -> {
            waitfor(2000);
            return "result";};
        List<Future<String>> list = service.invokeAll(
                List.of(task, task, task), 3, TimeUnit.SECONDS);
        for (Future<String> future : list) {
            showFuture(future);
        }
        LOG.info("end");
    }
    
    private static void showFuture(Future<String> future){
        try {
            LOG.info("Done:" + future.isDone() +  
                    ",Cancel:" + future.isCancelled());
        } catch (Exception e) {
            LOG.error("EX:Cancel", e);
        }
    }
    
    private static void waitfor(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            LOG.error("EX:Interrupted", ex);
        }
    }
}
