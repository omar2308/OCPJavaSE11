/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17;

import java.util.List;

/**
 *
 * @author Omar
 */
public class ReductionTest {

    public static void main(String[] args) {
        System.out.println(List.of("w", "o", "l", "f")
                .parallelStream()
                .reduce("_",
                        (s1, c) -> s1 + c,
                        (s2, s3) -> s2 + s3));  // wolf

        System.out.println(List.of(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0, (a, b) -> (a - b)));

        System.out.println(List.of("w", "o", "l", "f", "a", "n", "g")
                .parallelStream()
                .reduce("X", String::concat));
    }
}
