/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08.herencia.stat;

/**
 *
 * @author Omar
 */
public class ZooTickets {
   private String name = "BestZoo";
   { System.out.print(name+"-"); }
   private static int COUNT = 0;
   static { System.out.print(COUNT+"-"); }
   static { COUNT += 10; System.out.print(COUNT+"-"); }

   public ZooTickets() {
      System.out.print("z-");
   }

   public static void main(String... patrons) {
      new ZooTickets();
   }
}
