/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17;

import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class ParallelTest {

    public static void main(String[] args) {
        Stream<Integer> s1 = List.of(1, 2).stream();
        Stream<Integer> s2 = s1.parallel();
        
        Stream<Integer> s3 = List.of(1, 2).parallelStream();
    }
}
