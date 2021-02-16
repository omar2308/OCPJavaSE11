/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch03;

/**
 *
 * @author Omar
 */
public class Comparing {
    public static void main(String[] args) {
        //boolean monkey = true == 3;
        
        System.out.print(null == null);
        Pirata a = new Pirata("Juan");
        Pirata b = new Pirata("Juan");
        System.out.println("a==b:" + (a==b));
        
        Pirata c = new Pirata("Jose");
        System.out.println("a==c:" + (a==c));
        
        c = b;
        System.out.println("c==b:" + (c==b));
        a = b;
        System.out.println("a==b:" + (a==b));
        
        a = null;
        System.out.println("a==null:" + (a==null));
        System.out.println("-------------");
        
        int x = 5;
        float y = 5.0f;
        System.out.println("x == y?" + (x == y));
    }
}

class Pirata{
    private String name;

    public Pirata(String name) {
        this.name = name;
    }
    
}

