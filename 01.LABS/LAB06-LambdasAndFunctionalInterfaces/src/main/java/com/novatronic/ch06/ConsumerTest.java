/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch06;

import java.util.function.Consumer;

/**
 *
 * @author Omar
 */
public class ConsumerTest {
    public static void main(String[] args) {
        ejecuta(x -> System.out.println("<name>" + x + "</name>"), "Juan");
        ejecuta(x -> System.out.println("{'name':'" + x + "'}"), "Juan");
    }
    
    public static void ejecuta(Consumer<String> c, String nombre){
        c.accept(nombre);
    }
}
