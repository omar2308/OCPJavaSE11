/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

/**
 *
 * @author Omar
 */
public class MathTest {
    public static void main(String[] args) {
        //int num = Math.round(2.3);
        int num = Math.round(2.3f);
        
        double sal = Math.random();
        System.out.println(sal);
        
        int aleatorio = (int)(10*Math.random());
        System.out.println(aleatorio);
    }
}
