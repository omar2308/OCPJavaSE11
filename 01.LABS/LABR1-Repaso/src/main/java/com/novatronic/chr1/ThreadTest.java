/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.chr1;

/**
 *
 * @author Omar
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        
        synchronized(ThreadTest.class){
            Thread.currentThread().wait();
        }
        
        ThreadTest t = new ThreadTest();
        String a = "a";
        String b = "b";
        t.algo(b);
        t.algo(b);
        t.algo(b);
        t.algo(b);
        t.algo2(a);
    }
    
    public void algo(String x) throws InterruptedException{
        synchronized(x){
            Thread.currentThread().wait();
        }
    }
    
    public void algo2(String x) throws InterruptedException{
        synchronized(x){
            Thread.currentThread().notify();
        }
    }
}
