/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.lambdas;

import java.util.function.Predicate;

/**
 *
 * @author Omar
 */

public class Crow {
   private String color;
   private static int age;
   
   public void caw(String name) {
      String volume = "loudly";
      //volume = "";
      color = "";
      age = 2;
      Predicate<String> p = s -> (name+volume+color + age).length()==10;
      
      //name = "";
   }
}