/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch09.other;

import com.novatronic.ch09.interf.WalksOnTwoLegs;

/**
 *
 * @author Omar
 */
public class InterfaceTest {
    public static void main(String[] args) {
        WalksOnTwoLegs c = new A();
        
    }
}

class A implements WalksOnTwoLegs{
    public void walk(){}
}
