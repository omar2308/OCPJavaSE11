/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.interf;

/**
 *
 * @author Omar
 */
public interface Swim {
    private static void breathe(String type){
        System.out.println("inhale");
        System.out.println("realice movimeinto" + type);
        System.out.println("exhale");
    }
    
    static void butterfly()         { breathe("butterfly"); }
    public static void freestyle()  { breathe("freestyle"); }
    default void backstroke()       { breathe("backstroke"); }
    private void breatstroke()      { breathe("breatstroke"); }
}