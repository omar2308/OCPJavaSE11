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
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Omar
 */
public class InvokeAnyTest {
    private static final Logger LOG = LoggerFactory.getLogger(InvokeAllTest.class);
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        LOG.info("begin");
        Callable<String> task = () -> {
            waitfor(2000);
            return "result";};
        String result = service.invokeAny(
                List.of(task, task, task), 3, TimeUnit.SECONDS);
        LOG.info("result:" + result);
        LOG.info("end");
        List<Runnable> list = service.shutdownNow();
        LOG.info("" + list.size());
    }
    
    private static void waitfor(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            LOG.error("EX:Interrupted", ex);
        }
    }
}
