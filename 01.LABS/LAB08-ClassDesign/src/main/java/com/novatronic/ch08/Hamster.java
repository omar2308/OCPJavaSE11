/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08;

/**
 *
 * @author Omar
 */
public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight) {               // first constructor
        this(weight, "brown");
//        this.weight = weight;
//        color = "brown";
        //this(weight, "brown");
    }

    public Hamster(int weight, String color) {     // second constructor
        this.weight = weight;
        this.color = color;
    }
}
