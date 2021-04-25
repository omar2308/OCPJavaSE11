/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.func.obj;

/**
 *
 * @author Omar
 */
public interface InterfObjTest {
    
}

interface Soar{
   String toString();
}

@FunctionalInterface
interface Dice{
    String toString();
    public boolean equals(Object obj);
    //public boolean equals(Soar obj);
    public int hashCode();
    public void rest();
}
