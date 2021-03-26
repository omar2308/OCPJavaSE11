/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch09;

/**
 *
 * @author Omar
 */

abstract class Mamal{
    abstract void showHorm();
    abstract void eatLeaf();
    { System.out.println("A");}
    static { System.out.println("B");}
}

abstract class Rhino extends Mamal{
    { System.out.println("C");}
    static {System.out.println("D");}
    void showHorm(){};
}

public class BlackRhino extends Rhino{
    { System.out.println("E");}
    static {System.out.println("F");}
    void eatLeaf(){}
    
    public static void main(String[] args) {
        BlackRhino br = new BlackRhino();
    }
}


