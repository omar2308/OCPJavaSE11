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
class Bunny implements Hop{
    public void printDetails(){
        //System.out.println("..." + getJumpHeight());  //Req. nombre de Interf.
        System.out.println("..." + Hop.getJumpHeight());
    }
}

interface Hop {
    /*public*/ static int getJumpHeight(){
        return 8;
    }
}
