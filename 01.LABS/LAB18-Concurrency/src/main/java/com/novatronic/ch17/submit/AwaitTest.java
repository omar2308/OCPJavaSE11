/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17.submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Omar
 */
public class AwaitTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        Runnable run = () -> { 
            for(int i =0; i<10; i++) System.out.println("..."); 
            System.out.println(Thread.currentThread().getName() + " finished");
        };
        try {
            service = Executors.newSingleThreadExecutor();
            service.submit(run);
            service.submit(run);
            service.submit(run);
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
        if (service != null) {
            service.awaitTermination(1, TimeUnit.MINUTES);

            // Check whether all tasks are finished
            if (service.isTerminated()) {
                System.out.println("Finished!");
            } else {
                System.out.println("At least one task is still running");
            }
        }
    }
}
