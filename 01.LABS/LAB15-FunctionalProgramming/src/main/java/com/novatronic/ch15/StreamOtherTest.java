/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Omar
 */
public class StreamOtherTest {

    public static void main(String[] args) {
        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());
    }

    private static void threeDigit(Optional<Integer> optional) {
        if (optional. isPresent()) {  // outer if
            var num = optional.get();
            var string = "" + num;
            if (string.length() == 3) // inner if
            {
                System.out.println(string);
            }
        }
        
        //Misma funcionalidad del codigo anterior
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
        
        optional.map(StreamOtherTest::transform2);
        optional.map(n -> {
            try {
                return transform(n);
            } catch (Exception e) {
                throw new IllegalArgumentException("algo...", e);
            }
        });
    }
    
    private static String transform2(int n) throws IllegalArgumentException{
        try {
            return transform(n);
        } catch (Exception e) {
            throw new IllegalArgumentException("algo...", e);
        }
    }
    
    private static String transform(int n) throws IOException{
        return "" + n;
    }
}
