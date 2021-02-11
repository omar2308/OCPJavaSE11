/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch02;

/**
 *
 * @author Omar
 */
public class Scope {

    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
        
        long d = 7L;
        float c = 3.0F;
    }
}
