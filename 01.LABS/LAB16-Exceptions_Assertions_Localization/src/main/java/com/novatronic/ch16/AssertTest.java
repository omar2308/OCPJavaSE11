/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16;

/**
 *
 * @author Omar
 */
public class AssertTest {
    public static void main(String[] args) {
        int coc = cociente(2, 0);
        System.out.println("coc:" + coc);
    }
    
    public static int cociente(int dividendo, int divisor){
        assert divisor>0 : "Divisor incorrecto:" + divisor;
        return dividendo / divisor;
    }
}
