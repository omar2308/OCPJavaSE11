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
public class CheckResults {

    private static final Logger LOG = LoggerFactory.getLogger(CheckResults.class);
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "-Start");
            for (int i = 0; i < 500; i++) {
                CheckResults.counter++;
            }
            System.out.println(Thread.currentThread().getName() + "-Finish");
        }).start();

        while (CheckResults.counter < 100) {
            System.out.println(Thread.currentThread().getName() + "-Not reached yet");
            Thread.sleep(2);
        }
        System.out.println(Thread.currentThread().getName() + "-Reached!");
    }
}
