/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08;

/**
 *
 * @author Omar
 */
public class Gopher2 {
    public Gopher2() {
      this(5);  // DOES NOT COMPILE
   }
   public Gopher2(int dugHoles) {
      //this();   // DOES NOT COMPILE produce llamada recursiva
   }

}
