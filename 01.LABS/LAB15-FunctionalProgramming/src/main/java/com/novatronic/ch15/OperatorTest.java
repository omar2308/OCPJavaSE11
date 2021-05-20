/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 *
 * @author Omar
 */
public class OperatorTest {
    public static void main(String[] args) {
        UnaryOperator<String> u1 = x -> x.toUpperCase();
        System.out.println(u1.apply("Algo"));
        
        UnaryOperator<String> u2 = String::toUpperCase;
        System.out.println(u2.apply("Xxxx"));
        
        BinaryOperator<String> b1 = (a,b) -> a.concat(b);
        System.out.println(b1.apply("aaa", "bbb"));
        
        BinaryOperator<String> b2 = String::concat;
        System.out.println(b2.apply("aaa_", "bbb"));
        
    }
}
