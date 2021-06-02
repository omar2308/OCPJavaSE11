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
public class StreamMatchTest {
    public static void main(String[] args) {
        boolean result = Stream.of(2,3,7,2,3,8).allMatch(x -> x>3);
        System.out.println(result);
        
        boolean result1 = Stream.of(2,3,7,2,3,8).anyMatch(x -> x>3);
        System.out.println(result1);
        
        boolean result2 = Stream.of(2,3,7,2,3,8).noneMatch(x -> x>3);
        System.out.println(result2);
    }
}
