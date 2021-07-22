/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17;

import java.util.List;

/**
 *
 * @author Omar
 */
public class ParallelTest2 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List.of(1, 2, 3, 4, 5, 6, 7, 8)
                .parallelStream()
                .map(w -> doWork(w))
                .forEach(s -> System.out.println(s + " " +Thread.currentThread().getName()));

        System.out.println();
        var timeTaken = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Time: " + timeTaken + " seconds");
    }

    private static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        return input;
    }
}
