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
public class StreamMinMaxTest {
    public static void main(String[] args) {
        Optional<Integer> val = Stream.of(1,56,3,7,9,10).min((a,b) -> a-b );
        System.out.println("val:" + val);
        Optional<Integer> val2 = Stream.of(1,56,3,7,9,10).max((a,b) -> a-b );
        System.out.println("val:" + val2);
        
        boolean val3 = Stream.of(1,56,3,7,9,10)
                .anyMatch(x -> x > 20);
        System.out.println("val3" + val3);
        
        boolean val4 = Stream.of(1,56,3,7,9,10)
                .allMatch(x -> x > 50);
        System.out.println("val3" + val4);
        
        boolean val5 = Stream.of(1,56,3,7,9,10)
                .noneMatch(x -> x > 60);
        System.out.println("val3" + val5);
    }
}
