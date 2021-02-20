/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch04;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class ForEachTest {
    public static void main(String[] args) {
        String[] arrr = {"Hola", "Mundo"};
        for (String elemento : arrr) {
            System.out.println(elemento);
        }
        
        var lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("Mundo");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        
        System.out.println("---------------");
        
        String[] names = new String[3];
//        for(int name : names) {  // DOES NOT COMPILE
//          System.out.print(name + " ");
//        }

    }
}
