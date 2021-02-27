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
        String[] params = {"a", "b", "c"};
        metodo("a", "b", "c", "d");
        metodo(params);
    }
    
    public static void metodo(String... cadenas){
        System.out.println("----------");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
        }
    }
}
