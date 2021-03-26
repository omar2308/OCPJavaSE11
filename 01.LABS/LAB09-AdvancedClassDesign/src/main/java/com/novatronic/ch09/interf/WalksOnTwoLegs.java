/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch09.interf;

import java.io.IOException;

/**
 *
 * @author Omar
 */
//implicito: abstract
public abstract interface WalksOnTwoLegs {
    //implicito: public static final 
    public static final int MIN = 2;
    //implicito: public abstract
    public abstract void walk() throws IOException;
}
