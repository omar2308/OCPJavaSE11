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
abstract class Bear {
   abstract CharSequence chew();
   public Bear(int x){};
   public Bear() {
      System.out.println(chew());  // Does this compile?
   }
}

public class Panda extends Bear {
   String chew() { return "yummy!"; }
   public static void main(String[] args) {
      new Panda();
   }
}
