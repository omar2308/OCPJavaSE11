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
public class ShortCircuitTest {

    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        System.out.println("resultado:" + (a & (b = true)));

        System.out.println("a:" + a);
        System.out.println("b:" + b);

        System.out.println("------------");

        int rabbit = 6;
        //int h = ++rabbit++;
        boolean bunny = (rabbit >= 6) | (rabbit <= 7);
        System.out.println("bunny:" + bunny);
        System.out.println(rabbit);
        
        //int m = 3.0 & 1;
        double h = 3 & 1L;

    }
}
