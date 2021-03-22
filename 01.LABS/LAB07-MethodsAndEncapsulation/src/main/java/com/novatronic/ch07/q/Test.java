/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch07.q;

/**
 *
 * @author Omar
 */
public class Test {
   public void print(byte x) {
      System.out.print("byte-");
   }
   public void print(short x) {
      System.out.print("short-");
   }
   public void print(float x) {
      System.out.print("float-");
   }
   
   public void print(double x) {
      System.out.print("double-");
   }
   
   public void print(Object x) {
      System.out.print("Object-");
   }
   public static void main(String[] args) {
      Test t = new Test();
      short s = 123;
      t.print(s);
      t.print(3);
      t.print('ñ');
      t.print(true);
      t.print(6.789);
   }
}
