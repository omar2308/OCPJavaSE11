/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch06;

import java.util.Comparator;

/**
 *
 * @author Omar
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Comparator<Integer> c = (a,b) -> a.compareTo(b);
        ejecuta(c, Integer.MAX_VALUE);
        ejecuta((a,b) -> b.compareTo(a), Integer.MIN_VALUE);
    }
    
    public static void ejecuta(Comparator<Integer> c, Integer base){
        int[] array = { 4,9,7,2, 5};
        int buscado = base;
        for (int i = 0; i < array.length; i++) {
            buscado = c.compare(buscado, array[i]) > 0
                    ? array[i]
                    : buscado;
            System.out.println("b:" + buscado);
        }
        System.out.println("buscado:" + buscado);
    }
}
