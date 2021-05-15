/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.eva;

import com.novatronic.ch12.eva.Lion;
import com.novatronic.ch12.eva.Lion.Den;
import java.util.function.Predicate;

/**
 *
 * @author Omar
 */
public class Hyena {
   private int age = 1;
   public static void main(String[] args) {
      var p = new Hyena();
      double height = 10;
      int age = 1;
      testLaugh(p, vaer -> p.age <= 10);
      age = 2;
      
      Den d = new Den();
   }
   static void testLaugh(Hyena panda, Predicate<Hyena> joke) {
      var r = joke.test(panda) ? "hahaha" : "silence";
      System.out.print(r);
   }
   
   
}

