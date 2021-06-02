/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.stream.primitive;

import java.util.OptionalInt;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class MapTest {
    public static void main(String[] args) {
        Stream<String> str1 = Stream.of("2", "3", "5", "7");
        int max = str1.mapToInt(x -> Integer.parseInt(x))
                .max()
                .getAsInt();
        System.out.println("max:" + max);
        
        Stream<String> str2 = Stream.of("2", "3", "5", "7");
        str2.mapToInt(Integer::parseInt)
                .mapToObj(x -> "0" + x)
                .forEach(System.out::println);
        
        
        
    }
}
