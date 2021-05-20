/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @author Omar
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        
        System.out.println(f1.apply("algo"));
        System.out.println(f2.apply("algo"));
        
        BiFunction<String, String, String> bf1 = String::concat;
        System.out.println(bf1.apply("aaa", "bbb"));
    }
}
