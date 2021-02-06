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
public class Chick {
    { System.out.println("hola CHick - 1");
        //System.out.println("name:" + name);
    }
 private String name = "Fluffy - 5";
 { System.out.println("setting field - 2"); 
 System.out.println("name:" + name);
 }
 public Chick() {
   name = "Tiny";
   System.out.println("setting constructor - 6");
 }
 
 { System.out.println("aca hay uno - 3");}
  public static void main(String[] args) {
    Chick chick = new Chick();
   System.out.println(chick.name + " - 7"); } 

  { System.out.println("aca hay otro - 4");
  }
}
