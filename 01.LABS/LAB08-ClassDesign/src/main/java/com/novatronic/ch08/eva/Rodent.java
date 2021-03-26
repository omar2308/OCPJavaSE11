/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08.eva;

/**
 *
 * @author Omar
 */
public class Rodent {
   public Rodent(int x) {}
   protected static Integer chew() throws Exception {
      System.out.println("Rodent is chewing");
      return 1;
   }
}
class Beaver extends Rodent {
    public Beaver(){ super(1);}
   public static Integer chew() throws RuntimeException {
      System.out.println("Beaver is chewing on wood");
      return 2;
   } }
