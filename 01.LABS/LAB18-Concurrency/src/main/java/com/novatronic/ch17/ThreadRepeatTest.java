/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17;

/**
 *
 * @author Omar
 */
public class ThreadRepeatTest {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hola " + i);
            }
        });
        t.start();
        
        t.start();
    }
}
