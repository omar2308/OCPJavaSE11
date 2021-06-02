/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.stream.primitive;

import java.util.function.DoubleToIntFunction;

/**
 *
 * @author Omar
 */
public class PrimitiveFunctionTest {
    public static void main(String[] args) {
        var d = 1.0;
        DoubleToIntFunction f1 = x -> 1;
        f1.applyAsInt(d);
    }
}
