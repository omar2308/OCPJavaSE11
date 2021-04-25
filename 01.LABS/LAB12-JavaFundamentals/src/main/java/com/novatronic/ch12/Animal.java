/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12;

/**
 *
 * @author Omar
 */
public abstract class Animal {
    abstract Number chew();
}

class Hippo extends Animal{
    final static int x = 4;
    final Integer chew() {
        return Integer.valueOf(3);
    }
    /*final*/ static void algo(){}
}

class PygmyHippo extends Hippo{
    final static int x = 4;
    //Number chew() {} //Esto no funciona
    void otro(){
        this.chew();
    }
    static void algo(){}
}