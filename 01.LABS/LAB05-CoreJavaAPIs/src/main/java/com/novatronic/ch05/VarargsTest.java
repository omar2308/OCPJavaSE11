/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

/**
 *
 * @author Omar
 */
public class VarargsTest {
    public static void main(String[] args) {
        metodo("a", "b", "c", "d");
    }
    
    public static void metodo(String... cadenas){
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
        }
    }
}
