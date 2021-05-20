/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 *
 * @author Omar
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> p1 = x -> x.isEmpty();

        String algo = "hola";
        Predicate<String> p2 = algo::endsWith;
        System.out.println(p2.test("la"));

        Predicate<String> p3 = String::isEmpty;
        System.out.println(p3.test("dd"));

        BiPredicate<String, String> bp1 = (a, b) -> a.endsWith(b);

        BiPredicate<String, String> bp2 = String::endsWith;

        String otro = "otro";
        BiPredicate<String, Integer> bp3 = otro::startsWith;
        System.out.println(bp3.test("r", 2));

        System.out.println("-------------------");
        Predicate<String> mp1_empieza = x -> x.startsWith("Hola");
        Predicate<String> mp1_azul = x -> {
            System.out.println("x_azul:" + x);
            return x.contains("azul");
        };
        Predicate<String> mp1_verde = x -> {
            System.out.println("x_verde:" + x);
            return x.contains("verde");
        };

        boolean result = mp1_empieza
                .and(mp1_azul)
                .negate()
                .or(mp1_verde)
                .test("Hiola mundo verde");
        System.out.println(result);

    }
}
