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
        
        System.out.println("---------------");
        Function<String, String> fu1 = x -> "" + x + "fu1-";
        Function<String, String> fu2 = x -> "" + x + "fu2-";
        Function<String, String> fu3 = x -> "" + x + "fu3-";
        
        String result = fu1.andThen(fu2).andThen(fu3).apply("hh");
        System.out.println(result);
        
        result = fu1.compose(fu2).compose(fu3).apply("zz");
        System.out.println(result);
    }
}
