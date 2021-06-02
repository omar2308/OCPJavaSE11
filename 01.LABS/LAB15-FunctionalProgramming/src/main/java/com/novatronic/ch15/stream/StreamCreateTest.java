/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class StreamCreateTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        long cant = stream.count();
        System.out.println("cant:" + cant);
        
        Optional<Integer> val = Stream.generate( () -> 3).findAny();
        System.out.println("val:" + val);
        
        Optional<Integer> val2 = Stream.iterate(2, x -> 2*x).findAny();
        System.out.println("val:" + val2);
        
        long val3 = Stream.iterate(2, x -> x < 10 ,x -> 2*x).count();
        System.out.println("val:" + val3);
        
    }
}
