/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch10;

/**
 *
 * @author Omar
 */
public class TryCatchFinallyTest {
    public static void main(String[] args) {
        TryCatchFinallyTest t = new TryCatchFinallyTest();
        t.explore();
    }
    void explore() {
        try {
            System.out.println("en try");
            lanza();
        } catch (Exception e) {
            System.out.println("en exception");
            throw new IllegalArgumentException("en catch");
        } finally {
            System.out.println("en finally");
            throw new IllegalArgumentException("en finally");
        }
        //System.out.println("en ejecuta");
    }
    
    void lanza(){
        throw new IllegalArgumentException("lanza");
    }
}
