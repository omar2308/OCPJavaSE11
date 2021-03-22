/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch07;

/**
 *
 * @author Omar
 */
public class StaticTest {
    private static String name;
    private int num;
    public static void main(String[] args) {
        StaticTest t = new StaticTest();
        System.out.println("name:" + t.name);
        System.out.println("name:" + StaticTest.name);
        t = null;
        System.out.println("name:" + t.name);
        
        //metodo();
        
    }
    
    public void metodo(){
        
    }
}
