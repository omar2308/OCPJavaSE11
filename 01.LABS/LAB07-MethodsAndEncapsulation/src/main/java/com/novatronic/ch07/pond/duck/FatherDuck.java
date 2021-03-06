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
public class FatherDuck {

    private String noise = "quack";
    String name = "Father";

    private void quack() {
        System.out.println(noise);     // private access is ok
    }

    private void makeNoise() {
        quack();                    // private access is ok
    }
    
    public static void main(String[] args) {
        FatherDuck duck = new FatherDuck();
        duck.noise = "";
        duck.makeNoise();
        duck.name = "";
    }
}
