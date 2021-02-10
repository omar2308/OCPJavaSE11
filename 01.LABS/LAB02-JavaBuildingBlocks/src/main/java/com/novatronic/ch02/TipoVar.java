/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch02;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class TipoVar {
    //private static var g = 3;
    //private var g = 3;
    private String nombre;
    {
        var t = 5;
    }
    public void metodo(){
        System.out.println("nombre:" + nombre);
    }

    public static void main(String[] args) {
        var apples = (short) 10;
        apples = (byte) 5;
        //apples = 1_000_000;  // DOES NOT COMPILE

        var x = (byte) 127;
        //x = 128;

        var question = 1;
        //question = 5.0/4;
        System.out.println("question:" + question);
        var y = (3.0 / 2);
        System.out.println("y:" + y);

        var z = new ArrayList<>();

        var var = 6;
        {
            var d = 5;
        }
        
        //System.out.println("nombre:" + nombre);
    }
}
