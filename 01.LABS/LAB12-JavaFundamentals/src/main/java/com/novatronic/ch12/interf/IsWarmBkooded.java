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
public interface IsWarmBkooded {
    boolean hasScales();
    default double getTemperatur(){
        return 10.0;
    }
}

abstract class XX {
    //default double getTemperatur(){ return 10.0;}
}
