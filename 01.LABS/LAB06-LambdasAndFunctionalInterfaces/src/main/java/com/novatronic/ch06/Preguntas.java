/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch06;

import java.util.function.Supplier;

/**
 *
 * @author Omar
 */
public class Preguntas {

    public static void main(String[] args) {
        int length = 3;
        Integer x = 4;
        x++;
        System.out.println("x:" + x);

        for (Integer i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                Supplier<Integer> supplier = () -> length; // A
                System.out.println(supplier.get());        // B
            } else {
                Hola j = new Hola(i);
                j.setX(0);
                Supplier<Integer> supplier = () -> j.getX();      // C
                System.out.println(supplier.get());        // D
            }
        }

    }
}

class Hola{
    private int x;

    public Hola(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    
}
