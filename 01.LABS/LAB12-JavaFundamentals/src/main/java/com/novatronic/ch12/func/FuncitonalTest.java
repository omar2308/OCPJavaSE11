/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.func;

/**
 *
 * @author Omar
 */
public interface FuncitonalTest {
    
}
@FunctionalInterface
interface Sprintx {
    public void sprint(int speed);
}

interface Dash extends Sprint{}
interface Skip extends Sprint{
    void skip();
}
interface Sleep{
    private void snore(){}
    default int getZzz(){ return 1;}
}

interface Climb{
    void reache();
    default void fall(){}
    static int getBackup(){return 200;}
    private static boolean checkHeight(){return true;}
}



