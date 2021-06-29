/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17;

/**
 *
 * @author Omar
 */
public class CheckResults {
   private static int counter = 0;
   public static void main(String[] args) throws InterruptedException {
      new Thread(() -> {
         for(int i = 0; i < 500; i++) {
             CheckResults.counter++;
             System.out.println("...");
         }
      }).start();
      
      while(CheckResults.counter < 100) {
         System.out.println("Not reached yet");
         Thread.sleep(2);
      }
      System.out.println("Reached!");
   }
}
