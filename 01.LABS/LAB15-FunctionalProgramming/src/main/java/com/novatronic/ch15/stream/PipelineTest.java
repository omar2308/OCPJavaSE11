/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.stream;

import java.util.List;

/**
 *
 * @author Omar
 */
public class PipelineTest {

    public static void main(String[] args) {
        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        list.stream()
                .filter(n -> n.length() < 5)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}
