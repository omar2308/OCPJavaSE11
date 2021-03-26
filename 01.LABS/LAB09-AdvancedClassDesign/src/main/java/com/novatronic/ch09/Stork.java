/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch09;

/**
 *
 * @author Omar
 */
abstract class Bird {
   public abstract String getName();
   public void printName() {
      System.out.print(getName());
   }
}

public class Stork extends Bird {
   public String getName() { return "Stork!"; }
   
   public static void main(String[] args) {
      new Stork().printName();
   }
}
