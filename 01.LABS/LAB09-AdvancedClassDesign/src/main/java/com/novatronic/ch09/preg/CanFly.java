/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch09.preg;

/**
 *
 * @author Omar
 */
public interface CanFly {
   int fly();
   String fly(int distance);
}
interface HasWings {
   abstract Integer fly();
   public abstract Object getWingSpan();
}
//abstract class Falcon implements CanFly, HasWings {}
