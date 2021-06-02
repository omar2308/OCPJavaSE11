/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.stream;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class CollectTest {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        StringBuilder result = stream1.collect(
                () -> {
                    System.out.println("On suppliler");
                    return new StringBuilder();
                },
                (sb, str)-> {
                    System.out.println("on consumer");
                    sb.append(str);
                },
                (sb1, sb2) -> {
                    System.out.println("on combined");
                    sb1.append(sb2);
                });
        
        System.out.println(result);
        
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        StringBuilder result2 = stream2.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append);
        System.out.println(result2);
        
        Stream<String> stream3 = Stream.of("w", "o", "l", "f");
        TreeSet<String> result3 = stream3.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll);
        System.out.println(result3);
        
        Stream<String> stream4 = Stream.of("w", "o", "l", "f");
        TreeSet<String> result4 = stream4.collect(
                Collectors.toCollection(TreeSet::new));
        System.out.println(result4);
        
        Stream<String> stream5 = Stream.of("w", "o", "l", "f");
        Set<String> result5 = stream5.collect(
                Collectors.toSet());
        System.out.println(result5);
    }
}
