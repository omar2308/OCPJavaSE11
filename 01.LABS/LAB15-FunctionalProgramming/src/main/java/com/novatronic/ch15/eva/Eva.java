/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.eva;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Omar
 */
public class Eva {
    public static void main(String[] args) {
        String r = Stream.iterate(1, x -> ++x)
                .limit(5)
                .map(x -> "" + x)
                .collect(Collectors.joining());
        System.out.println(r);
        
        
    }
}
