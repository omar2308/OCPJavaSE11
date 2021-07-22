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
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Omar
 */
public class SheepManagerAtomic {

    private static AtomicInteger sheepCount = new AtomicInteger(0);
    private static Set<Integer> set = new HashSet<Integer>();

    private void incrementAndReport() {
        for (int i = 0; i < 200; i++) {
            int local = sheepCount.incrementAndGet();
            set.add(local);
            //System.out.print((local) + " ");
        }
        //System.out.println("");
    }
    
    public void show(){
        System.out.println("sheepCount:" + sheepCount);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("CPU:" + Runtime.getRuntime().availableProcessors());
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(25);
            SheepManagerAtomic manager = new SheepManagerAtomic();
            for (int i = 0; i < 20; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
            service.awaitTermination(10, TimeUnit.SECONDS);
            System.out.println("set.size:" + set.size());
            //System.out.println("set:" + set);
            System.out.println("sheepCount:" + sheepCount);
        }
    }
}
