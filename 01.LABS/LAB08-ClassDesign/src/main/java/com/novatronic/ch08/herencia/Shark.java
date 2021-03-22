/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08.herencia;

/**
 *
 * @author Omar
 */
public class Shark extends Fish {

    private int numberOfFins = 8;
    
    public Shark(int age){
        super(age);
        this.size = 4;
    }
}

class Fish {

    protected int size;
    private int age;

    public Fish(int age) {
        this.age = age;
    }
    
}
