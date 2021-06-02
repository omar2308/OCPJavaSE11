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
public class ReduceTest {
    public static void main(String[] args) {
        Optional<Integer> result = Stream.of(2,3,7,2,3,8)
                .reduce((a, b) -> {
                    System.out.println("a:" + a + ",b:" + b);
                    return a+b;
                });
        System.out.println("result:" + result);
        
        Optional<Integer> result2 = Stream.of(2)
                .reduce((a,b) -> a+b);
        System.out.println("result:" + result2);
        
        Integer r2 = Stream.of(2,3,7,2,3,8)
                .reduce(0,(a, b) -> {
                    System.out.println("a:" + a + ",b:" + b);
                    return a+b;
                });
        System.out.println("result:" + r2);
        
        System.out.println("----");
        Stream.of(2,3,7,2,3,8)
                .reduce((a,b) -> a+b)
                .ifPresent(System.out::println);
    }
}
