/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch07;

/**
 *
 * @author Omar
 */
public class MySingleton {
    private static MySingleton INSTANCE;
    private MySingleton(){}
    public static MySingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new MySingleton();
        }
        return INSTANCE;
    }
}
