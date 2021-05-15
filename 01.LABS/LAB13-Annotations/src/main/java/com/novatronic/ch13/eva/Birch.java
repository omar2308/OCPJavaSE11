/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch13.eva;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.function.Predicate;

/**
 *
 * @author Omar
 */
@Floats
public class Birch implements @Floats Wood{
    boolean mill(){
        Predicate<Integer> t = (@Floats Integer a) -> a > 10;
        return (@Floats boolean)t.test(12);
    }
}

@Floats class Duck{}

interface Wood{}

@Target(ElementType.TYPE_USE)
@interface Floats{
    int buiyancy() default 2;
}
