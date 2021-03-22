/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08.herencia;

/**
 *
 * @author Omar
 */
public class MouseHouse {

    //{ volumen = 4;}
    private final int volume;
    private final String type;
    //{ volumen = 4;}
    
    public MouseHouse(String type) {
        this.type = type;
        this.volume = 2;
    }

    public MouseHouse() {  // DOES NOT COMPILE
        this("");
//        this.type = "";
//        this.volume = 2;    // DOES NOT COMPILE
    }

    public void metodo() {
        //this.volume = 10;
    }
}
