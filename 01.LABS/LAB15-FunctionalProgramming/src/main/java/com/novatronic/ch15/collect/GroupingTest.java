/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.collect;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class GroupingTest {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map);    // {5=[lions, bears], 6=[tigers]}

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map2 = ohMy2.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.toSet()));
        System.out.println(map2);    // {5=[lions, bears], 6=[tigers]}

        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map3 = ohMy3.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toSet()));
        System.out.println(map3); // {5=[lions, bears], 6=[tigers]}

        var ohMy4 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map4 = ohMy4.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()));
        System.out.println(map4);

        var ohMy5 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map5 = ohMy5.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map5);    // {5=2, 6=1}
    }
}
