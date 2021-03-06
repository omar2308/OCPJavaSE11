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
public class PrivateTest {
    String name = "";
    public static void main(String[] args) {
        PrivateTest pr = new PrivateTest();
        pr.metodo();
        metodo2();
    }
    
    private static void metodo2(){}
    
    private void metodo(){}
    
    private void metodo1(){
        this.metodo();
        metodo();
    }
}

class AN{
    PrivateTest ref;
    public void metodo(){
        //ref.metodo();
        //PrivateTest.metodo2();
        ref.name = "";
    }
}
