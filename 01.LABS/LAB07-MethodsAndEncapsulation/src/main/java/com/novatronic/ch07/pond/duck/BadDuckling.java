/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch07.pond.duck;

/**
 *
 * @author Omar
 */

public class BadDuckling {

    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
        duck.name = "";
        //duck.quack();                       // DOES NOT COMPILE
        //System.out.println(duck.noise);     // DOES NOT COMPILE
    }
}
