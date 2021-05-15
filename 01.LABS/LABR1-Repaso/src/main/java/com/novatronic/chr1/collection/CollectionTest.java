/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.chr1.collection;

import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class CollectionTest {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f!");
        int length = stream.reduce(0, (i, s) -> i + s.length(), (a, b) -> 
        {
            System.out.println("a:" + a + ",b:" + b);
            return a + b;
        });
        System.out.println(length); // 5
        Stream<Algo> algos = Stream.of(new Algo("a"), new Algo("b"), new Algo("d"));
        Stream<Algo> algosn = algos.sorted();
        //algosn.forEach(a -> System.out.println(a)); //produce excepcion al usar.
        algosn.mapToDouble(x -> 2.0);
    }
}

class Algo{
    private String name;
    public Algo(String name) {
        this.name = name;
    }    
}
