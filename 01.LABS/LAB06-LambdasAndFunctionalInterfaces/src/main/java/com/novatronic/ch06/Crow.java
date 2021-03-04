/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch06;

import java.util.function.Consumer;

/**
 *
 * @author Omar
 */
public class Crow {
   private String color;
   public void caw(String name) {
      String volume = "loudly";
      //name = "Caty";                      //name se esta modificando
      color = "black";                      //variables de instancia
                                            //son permitidas modificar
      Consumer<String> consumer = s ->
         System.out.println(name + " says "
            + volume + " that she is " + color);
      //volume = "softly";
   }
}
