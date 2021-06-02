/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.collect;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.minBy;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class OtherTest {

    public static void main(String[] args) {
        //Agrupar por KLongitud de palabra y solo poner la letra mayor

        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                s -> s.charAt(0),
                                Collectors.minBy((a, b) -> a - b))
                ));
        System.out.println(map);

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        var map2 = ohMy2.collect(
                groupingBy(
                        String::length,
                        mapping(
                                s -> s.charAt(0),
                                minBy((a, b) -> a - b))));
        System.out.println(map);    // {5=Optional[b], 6=Optional[t]}
    }
}
