/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.chr1;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Omar
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> opt = Optional.empty();

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());

        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;

        Function<Integer, Integer> combined = after.compose(before);
        System.out.println(combined.apply(3));   // 8
        
        
        
    }
}
