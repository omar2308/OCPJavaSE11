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
public class OverridingTest {
    public static void main(String[] args) {
        Hopper p = new Bunny();
        try {
            algo(p);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void algo(Hopper p) throws Exception{
        p.hop();
    }
}

class Hopper {
    public void hop() throws Exception{
        
    }
}

class Bunny extends Hopper{
    public void hop() throws CanNotHopException{
        throw new NullPointerException();
    }
}

class CanNotHopException extends Exception{}
