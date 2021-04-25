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
public interface Schedule {
    default void wakeUp()       { checkTime(7);}
    default void haveBreakFast(){ checkTime(9);}
    default void haveLunch()    { checkTime(12);}
    default void workOut()      { checkTime(18);}
    default void run(){}
    void call();
    
    private void checkTime(int hour){
        if(hour > 17){
            imprime("Estas tarde");
            run();
            call();
        }else{
            imprime("Te quedan " + (17 -hour) 
                    + " para enviar la invitacion");
        }
    }
    private void imprime(String msg){
        System.out.println(msg);
    }
}
