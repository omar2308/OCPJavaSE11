/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.stream;

import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class StreamEachTest {
    public static void main(String[] args) {
        Stream.of(1,4,2,6,18).forEach(System.out::println);
        //Stream.generate(() -> 3).forEach(System.out::println);
        System.out.println("---------------");
        //Stream.iterate(2, x -> x*2).forEach(System.out::println);
    }
}
