/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch09.interf;

/**
 *
 * @author Omar
 */
interface Nocturnal{
    public int hunt();
}

interface CanFly{
    public void flap();
}

interface HashBigEyes extends Nocturnal, CanFly{}

public class Owl implements Nocturnal, CanFly{

    public int hunt() { return 0;}

    public void flap() {}
    
}
