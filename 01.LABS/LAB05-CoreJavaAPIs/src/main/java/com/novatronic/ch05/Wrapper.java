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
public class Wrapper {
    public static void main(String[] args) {
        Integer n = Integer.valueOf(null);
        Integer m = 2;
        m = null;
        int x = m.intValue();
        
        int y = m;
        
    }
}
