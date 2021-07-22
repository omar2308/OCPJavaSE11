/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17.tsafe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Omar
 */
public class TryLockTest {

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Thread(() -> printMessage(lock)).start();
        if (lock.tryLock(10, TimeUnit.SECONDS)) {
            try {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

    public static void printMessage(Lock lock) {
        try {
            System.out.println(Thread.currentThread().getName());
            lock.lock();
        } finally {
            lock.unlock();
        }
    }
}
