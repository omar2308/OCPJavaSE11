/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.stream.primitive;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 *
 * @author Omar
 */
public class OptionalTest {
    public static void main(String[] args) {
        double d = IntStream.of(2,3,4,5).average().orElse(-1.0);
        System.out.println("d:" + d);
        
    }
}
