/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.preg;

/**
 *
 * @author Omar
 */
interface CanWalk {
   default void walk() { System.out.print("Walking"); }
   private void testWalk() {}
}
interface CanRun {
   abstract public void run();
   private void testWalk() {}
   default void walk() { System.out.print("Running"); }
}
public interface CanSprint extends CanWalk, CanRun {
   void sprint();
   default void walk(){ CanRun.super.walk();}
//   default void walk(int speed) { 
//      System.out.print("Sprinting");
//   }
   private void testWalk() {}
}