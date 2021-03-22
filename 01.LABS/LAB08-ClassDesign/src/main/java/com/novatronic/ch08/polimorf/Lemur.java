/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08.polimorf;

/**
 *
 * @author Omar
 */
public class Lemur extends Primate implements HasTail {
   public int age = 10;
   public boolean isTailStriped() {
      return false;
   }
   
   public static void main(String[] args) {
      Lemur lemur = new Lemur();
      System.out.println(lemur.age);
      
      HasTail hasTail = lemur;
      System.out.println(hasTail.isTailStriped());
      
      Primate primate = lemur;
      System.out.println(primate.hasHair());
      
       System.out.println("---------------");
       
       Object obj = primate;
       Primate primate2 = (Primate)obj;
       
       //String str = (String)obj;  //excepcion
       
       System.out.println(obj instanceof Primate);
       System.out.println(obj instanceof Lemur);
       System.out.println(obj instanceof HasTail);
       System.out.println(obj instanceof String);
       //System.out.println(primate instanceof String);
       //System.out.println((Object)primate instanceof String);
   }
}
