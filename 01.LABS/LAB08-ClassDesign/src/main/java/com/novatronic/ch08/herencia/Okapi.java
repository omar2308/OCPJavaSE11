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
 class GiraffeFamily {
    static { System.out.print("A"); }
    { System.out.print("B"); }
   
    public GiraffeFamily(String name) {
       this(1);
       System.out.print("C");  
    }
   
    public GiraffeFamily() {
       System.out.print("D");  
    }
    
    public GiraffeFamily(int stripes) {
       System.out.print("E");  
    }
 }
 public class Okapi extends GiraffeFamily {
    static { System.out.print("F"); }
    
    public Okapi(int stripes) {
       super("sugar");
       System.out.print("G");  
    }
    { System.out.print("H"); }
    
    public static void main(String[] grass) {
       new Okapi(1);
       System.out.println();
       new Okapi(2);
    }
 }
