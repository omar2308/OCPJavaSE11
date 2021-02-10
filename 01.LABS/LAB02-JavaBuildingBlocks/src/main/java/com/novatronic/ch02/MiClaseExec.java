/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch02;

/**
 *
 * @author Omar
 */
public class MiClaseExec {
    public static void main(String[] args) {
        System.out.println("v01->" + MiClase.variable01);
        System.out.println("*******************");
        
        MiClase c = new MiClase();
        System.out.println("__v02->" + c.variable02);
        c.variable02 = 1;
        MiClase a = new MiClase();
        a.variable02 = 2;
        
        System.out.println("v02->" + c.variable02);
        System.out.println("v01->" + c.variable01);
        
        System.out.println("--------------");
        
        System.out.println("v02->" + a.variable02);
        System.out.println("v01->" + a.variable01);
    }
}
