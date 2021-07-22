/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17.tsafe;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar
 */
public class SheepManagerLock {
    
    private static int sheepCount = 0;
    private static Set<Integer> set = new HashSet<Integer>();
    private Lock lock = new ReentrantLock();

    private void incrementAndReport() {
        for (int i = 0; i < 200; i++) {
            try {
                int local = 0;
                if(lock.tryLock(5, TimeUnit.SECONDS)){
                    try{
                        local = ++sheepCount;
                    }finally{
                        lock.unlock();
                    }
                }
                set.add(local);
                //System.out.print((local) + " ");
            }
            //System.out.println("");
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("CPU:" + Runtime.getRuntime().availableProcessors());
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(25);
            SheepManagerLock manager = new SheepManagerLock();
            for (int i = 0; i < 20; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
            service.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("set.size:" + set.size());
            //System.out.println("set:" + set);
            System.out.println("sheepCount:" + sheepCount);
        }
    }
}
