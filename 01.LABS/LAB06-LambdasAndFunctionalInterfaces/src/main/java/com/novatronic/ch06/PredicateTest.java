/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch06;

import java.util.function.Predicate;

/**
 *
 * @author Omar
 */
public class PredicateTest {
    public static void main(String[] args) {
        ejecuta(n -> n.startsWith("P"), "Pedro");
        ejecuta(n -> n.endsWith("s"), "Pedro");
    }
    
    public static void ejecuta(Predicate<String> p, String nombre){
        System.out.println("resultado:" + p.test(nombre));
    }
}
