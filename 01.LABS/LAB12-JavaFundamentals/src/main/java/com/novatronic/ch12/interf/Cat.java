/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.interf;

/**
 *
 * @author Omar
 */
public class Cat extends Minino implements Walk, Run{
    public static void main(String[] args) {
        Cat cat = new Cat();
        //System.out.println(cat.getSpeed());
    }
    public int getSpeed(){ return Walk.super.getSpeed();}
    public void maulla(){ super.maulla();}
}

class Minino{
    public void maulla(){}
}

interface Walk{
    public default int getSpeed(){ return 5;}
}

interface Run{
    public default int getSpeed(){ return 10; }
}
