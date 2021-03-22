/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch07.pond.shore;

import com.novatronic.ch07.pond.shore.Bird;

/**
 *
 * @author Omar
 */
public class OtherBird {
    public void swim() {
        //floatInWater();               // calling protected member
        //System.out.println(text);     // calling protected member
    }
    
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();               // DOES NOT COMPILE
        System.out.println(bird.text);     // DOES NOT COMPILE
    }
}
