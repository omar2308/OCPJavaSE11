/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class StreamIntemediaTest {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(2, 5, 7, 2, 6, 3);
        stream1.filter(x -> x > 3).forEach(System.out::println);

        System.out.println("------------");
        Stream<Integer> stream2 = Stream.of(2, 5, 7, 2, 6, 5);
        stream2.distinct().forEach(System.out::println);

        System.out.println("------------");
        Stream<Integer> stream3 = Stream.of(2, 5, 7, 2, 6, 5);
        stream3.limit(3).skip(2).forEach(System.out::println);

        System.out.println("------------");
        Stream<Integer> stream4 = Stream.of(2, 5, 7, 2, 6, 5);
        stream4.map(Transfor::tr)
                .map(Transfor::tr2)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("-----------------");
        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(m -> m.stream())
                .forEach(System.out::println);
        
        System.out.println("-------------");
        Stream<String> stream5 = Stream.of("hola", "mundo", "avion");
        stream5.sorted()
                .forEach(System.out::println);
        
        System.out.println("-------------");
        Stream<String> stream6 = Stream.of("hola", "mundo", "avion");
        stream6.sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        
        System.out.println("-------------");
        Stream<String> stream7 = Stream.of("hola1", "mundo2", "avion3");
        long count = stream7.peek(x -> System.out.println(x)).count();
        System.out.println("count:" + count);

    }
}

class Transfor {

    private String val;

    public Transfor(String val) {
        this.val = val;
    }

    public static Transfor tr(Integer a) {
        return new Transfor("d" + a);
    }

    public String tr2() {
        return val;
    }
}
