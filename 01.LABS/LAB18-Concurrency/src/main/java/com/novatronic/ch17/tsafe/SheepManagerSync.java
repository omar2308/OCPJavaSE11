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

/**
 *
 * @author Omar
 */
public class SheepManagerSync {

    private Boolean objsync = true;
    private static int sheepCount = 0;
    private static Set<Integer> set = new HashSet<Integer>();

    private void incrementAndReport() {
        for (int i = 0; i < 200; i++) {
            int local;
            //Integer a = Integer.valueOf(500);
            synchronized (this) {
                local = ++sheepCount;
                //System.out.print((local) + " ");
            }
            set.add(local);
        }
        //System.out.println("");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("CPU:" + Runtime.getRuntime().availableProcessors());
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(25);
            SheepManagerSync manager = new SheepManagerSync();
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
