/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.chr1;

/**
 *
 * @author Omar
 */
@FunctionalInterface
public interface Several {
   static void printName(String name) {}
   //default boolean cat(String name) { return true; }
   boolean cat(String name);
}

