/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch03;

/**
 *
 * @author Omar
 */
public class Eva {

    public static void main(String[] args) {
        int a = 2, b = 4, c = 2;
        System.out.println(a > 2 ? --c : b++);
        System.out.println("I- a:" + a + ",b:" + b + ",c:" + c);
        System.out.println(b = (a != c ? a : b++));
        System.out.println("II- a:" + a + ",b:" + b + ",c:" + c);
        System.out.println(a > b ? b < c ? b : 2 : 1);
        System.out.println("III- a:" + a + ",b:" + b + ",c:" + c);

//        int note = 1 * 2 + (long) 3;
//        short melody = (byte) (double) (note *= 2);
//        double song = melody;
//        float symphony = (float) ((song == 1_000f) ? song * 2L : song);

    }
}
