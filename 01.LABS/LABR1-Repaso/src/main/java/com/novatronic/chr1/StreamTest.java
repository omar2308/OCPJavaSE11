/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.chr1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class StreamTest {

    public static void main(String[] args) {
//        var stream = Stream.iterate(1, i -> i);
//        var b = stream.noneMatch(i -> i> 5);
//        System.out.println(b);
        //2.4
        Stream<Integer> s1 = Stream.of(8, 2);
        Stream<Integer> s2 = Stream.of(10, 20);
        s2 = s1.filter(n -> n > 4);
        s1 = s2.filter(n -> n < 1);
        System.out.println(s1.count());
//        System.out.println(s2.count());

        List lista = List.of(1, 2);
        Map<String, String> map = new HashMap<>();
    }
}
