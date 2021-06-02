/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.collect;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class BasicTest {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println("[" + result + "]"); // lions, tigers, bears

        ohMy = Stream.of("lions", "tigers", "bears");
        Double result2 = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(result2); // 5.333333333333333

        ohMy = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result3 = ohMy
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result3); // [tigers]

    }
}
