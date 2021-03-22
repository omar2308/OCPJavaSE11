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
class Animal {
   static { System.out.print("A"); }
}

public class Hippo extends Animal {
   static { System.out.print("B"); }
   public static void main(String[] grass) {
       System.out.println("Lion.age:" + Lion.age);
      System.out.print("C");
      new Hippo();
      new Hippo();
      new Hippo();
   }
}

class Lion{
    public static int age = 5;
    static { System.out.print("D"); }
}
