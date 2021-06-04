/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.eva;

import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class Test {
    public static void main(String[] args) {
        Stream.of("2", "3", "4")
                .peek(System.out::println)
                .forEach(System.out::println);
        System.out.println("sieze:");
        new String();
    }
}
