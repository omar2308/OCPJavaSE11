/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.collect;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class MapTest {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
                Collectors.toMap(s -> s, String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}

        //posible error
//        var ohMy2 = Stream.of("lions", "tigers", "bears");
//        Map<Integer, String> map2 = ohMy2.collect(Collectors.toMap(
//           String::length, 
//           k -> k));
        var ohMy3 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map3 = ohMy3.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2,
                TreeMap::new));
        System.out.println(map3);            // {5=lions,bears, 6=tigers}
        System.out.println(map3.getClass());
    }
}
