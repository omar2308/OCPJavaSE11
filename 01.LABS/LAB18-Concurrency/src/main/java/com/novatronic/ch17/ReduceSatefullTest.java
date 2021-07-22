/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Omar
 */
public class ReduceSatefullTest {

    public static void main(String[] args) {
        ReduceSatefullTest t = new ReduceSatefullTest();

        var list = t.addValues1(IntStream.range(1, 11));
        System.out.println(list);

        list = t.addValues1(IntStream.range(1, 11).parallel());
        System.out.println(list);
        
        list = t.addValues2(IntStream.range(1, 11).parallel());
        System.out.println(list);
    }

    public List<Integer> addValues1(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter(s -> {
            System.out.println("" + s + "," +Thread.currentThread().getName());
            return s % 2 == 0;})
                .forEach(i -> {
                    data.add(i);
                });
        return data;
    }

    public List<Integer> addValues2(IntStream source) {
        return source.filter(s -> {
            System.out.println("" + s + "," +Thread.currentThread().getName());
            return s % 2 == 0;})
                .boxed()
                .collect(Collectors.toList());
    }
}
