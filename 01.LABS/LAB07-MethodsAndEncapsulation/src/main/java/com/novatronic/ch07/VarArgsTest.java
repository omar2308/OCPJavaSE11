/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch07;

import java.util.Arrays;

/**
 *
 * @author Omar
 */
public class VarArgsTest {
    public static void main(String[] args) {
        VarArgsTest v = new VarArgsTest();
        v.vars(2,3,4,5);
        v.vars(1);
        v.vars();
        v.vars(new int[5]);
        int[] xx = {2};
        v.vars(xx);
        v.vars(null);
    }
    public void vars(int... enteros){
        System.out.println("enteros.length:" + Arrays.toString(enteros));
        //enteros es un  array
        //si no hay parametros el array es length=0
    }
    
    //public void vars2(int x, int... enteros){}
}
