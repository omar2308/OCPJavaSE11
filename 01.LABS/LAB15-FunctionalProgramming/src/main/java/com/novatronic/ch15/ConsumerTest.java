/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 *
 * @author Omar
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        c1.accept("Hola");
        
        Consumer<String> c2 = x -> System.out.println(x);
        c2.accept("Hola2");
        
        Consumer<String> c3 = ConsumerTest::print;
        c3.accept("Hola3");
        
        System.out.println("------------------");
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> bc1 = map::put;
        bc1.accept("k01", 1);
        System.out.println(map);
        
        BiConsumer<String, Integer> bc2 = (k,v) -> map.put(k,v);
        map.put("", 3);
        ///map = new HashMap<>();    // Tener cuidado con el efectivam... final
    }
    
    public static String print(String algo){
        System.out.println("print:" + algo);
        return algo;
    }
}
