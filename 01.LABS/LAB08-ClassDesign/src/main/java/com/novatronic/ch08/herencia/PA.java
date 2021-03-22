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
public class PA {
    PA() {
        System.out.println("PA");
    }

    public static void main(String[] args) {
        PAAA paaa = new PAAA();
    }
}

class PAA extends PA {
    PAA() {
        System.out.println("PAA");
    }
}

class PAAA extends PAA {
    PAAA(int n) {
        this();
        System.out.println("PAAA");
    }
    
    PAAA() {
        //super();
        System.out.println("PAAA");
    }
}
