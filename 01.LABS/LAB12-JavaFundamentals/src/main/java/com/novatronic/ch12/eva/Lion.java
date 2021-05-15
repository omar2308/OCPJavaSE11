/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.eva;

/**
 *
 * @author Omar
 */
public class Lion {
    private String age;
    class Cub {}
    static class Den {}

    static void rest() {
        Cub b = new Lion().new Cub();
        //Lion.Den d = new Den();
        Den d1 = new Lion.Den();
    }
    
    public void algo(){
        abstract class A{
            public void algo(){
                System.out.println(Lion.this.age);
            }
        };
        A a = new A(){};
    }
}
