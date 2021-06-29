/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Omar
 */
public class ThreadTest {
    private static final Logger LOG = LoggerFactory.getLogger(ThreadTest.class);
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 10; i++) { LOG.info("Hola");}
        };
        LOG.info("Creando hilo");
        //1. A partir de un runnable
        Thread t1 = new Thread(task, "Hilo-1");
        t1.start();
        Thread t2 = new MyThread("Hilo-2");
        t2.start();
        Thread t3 = new MyThread("Hilo-3");
        Thread t4 = new Thread(t3, "Hilo-4");
        t4.start();
        Thread t5 = new MyThread(task, "Hilo-5");
        t5.start();
        LOG.info("Hilo creado");
    }
}

class MyThread extends Thread{
    private static final Logger LOG = LoggerFactory.getLogger(MyThread.class);

    public MyThread(String name) {
        super(name);
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { LOG.info("Hola 2");}
    }
    
}
