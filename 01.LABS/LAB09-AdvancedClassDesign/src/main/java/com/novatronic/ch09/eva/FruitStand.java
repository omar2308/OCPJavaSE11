/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch09.eva;

/**
 *
 * @author Omar
 */
interface Apple {}
interface Orange {}
class Gala implements Apple {}
class Tangerine implements Orange {}
final class Citrus extends Tangerine {}
public class FruitStand {
   public static void main(String... farm) {
      Gala g = new Gala();
      Tangerine t = new Tangerine();
      Citrus c = new Citrus();
      //System.out.print(t instanceof Gala);
      System.out.print(c instanceof Tangerine);
      System.out.print(g instanceof Apple);
      System.out.print(t instanceof Apple);
      //System.out.print(c instanceof Apple);
      Apple a = (Apple)t;
} }

