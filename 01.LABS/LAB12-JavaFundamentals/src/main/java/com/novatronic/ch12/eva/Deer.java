/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.eva;

/**
 *
 * @author Omar
 */
public class Deer {
   enum Food {APPLES, BERRIES, GRASS}
   protected class Diet {
      private Food getFavorite() {
         return Food.BERRIES;
      }
   }
   public static void main(String[] seasons) {
//      switch(new Diet().getFavorite()) {
//         case APPLES: System.out.print("a");
//         case BERRIES: System.out.print("b");
//         default: System.out.print("c");
//      }
   }
}

