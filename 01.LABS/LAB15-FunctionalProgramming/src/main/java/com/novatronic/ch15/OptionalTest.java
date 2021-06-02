/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 *
 * @author Omar
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.empty();
        
        Optional<String> opt2 = Optional.of("hola");
        
        String value = "algo";
        Optional<String> opt3 = Optional.ofNullable(value);
        Optional<String> opt4 = Optional.ofNullable(null);
        
        System.out.println(opt1.isEmpty());
        if(opt2.isPresent()){
            System.out.println("value:" + opt2.get());
        }
        if(opt1.isEmpty()){
            System.out.println("value:vacio:");
        }
        
        opt3.ifPresent(x -> System.out.println("x:" + x));
        
        String value1 = opt1.orElse("otro");
        System.out.println("value1:" + value1);
        
        String value2 = opt1.orElseGet(() -> "nuev valor");
        System.out.println("value1:" + value2);
        
        try {
            opt1.orElseThrow();
        } catch (NoSuchElementException e) {
            System.out.println("lanzo excepcion");
        }
        
        try {
            opt1.orElseThrow( () -> new IllegalArgumentException("EX"));
        } catch (IllegalArgumentException e) {
            System.out.println("Otra EX");
        }
        
    }
}
