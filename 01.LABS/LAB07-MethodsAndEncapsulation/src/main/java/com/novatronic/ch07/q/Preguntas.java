/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch07.q;

/**
 *
 * @author Omar
 */
public class Preguntas {
    public static void main(String[] args) {
        Preguntas p = new Preguntas();
        boolean[] b = {true, true};
        boolean[] b1;
        b1 = new boolean[]{true, true};
        p.howMany(true, b);
        p.howMany(true, new boolean[]{true, true});
        p.howMany(true, new boolean[2]);
        //p.howMany(true, {true, true});
    }
    public int howMany(boolean b, boolean... b2) {
        return b2.length;
    }

}
