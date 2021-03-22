/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch07.q;

/**
 *
 * @author Omar
 */
public class P5 {
    public void roar(long longs, long...log) {}
    public void roar(long... longs){}
    
    public static void main(String[] args) {
        P5 p = new P5();
        p.roar(3L, new long[5]);
        //p.roar(3L, 3L);
        //p.roar(3); Ambiguedad
    }
}
