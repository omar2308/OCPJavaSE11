/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch10;

/**
 *
 * @author Omar
 */
public class TryCatchTest {

    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();

    }
    public void seeAnimals(){}
    public void getUp(){}

    void fall() {
        throw new RuntimeException();
    }
}
