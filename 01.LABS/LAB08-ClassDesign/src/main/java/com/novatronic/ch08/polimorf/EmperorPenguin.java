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
class Penguin {
    protected int age = 9;
   public static int getWidth(){ return 0;}
   public int getHeight() { return 3; }
   
   
   public void printInfo() {
      System.out.println(this.getHeight());
   }
   public void printWidth() {
      System.out.println(this.getWidth());
   }
   public void printAge() {
      System.out.println(this.age);
   }
}

public class EmperorPenguin extends Penguin {
    protected int age = 10;
   public static int getWidth(){ return 1;}
   public int getHeight() { return 8; }
   
   public void printWidth() {
      System.out.println(this.getWidth());
   }
   
   public static void main(String []fish) {
      new EmperorPenguin().printInfo();
      new EmperorPenguin().printWidth();
      new EmperorPenguin().printAge();
   }
}
