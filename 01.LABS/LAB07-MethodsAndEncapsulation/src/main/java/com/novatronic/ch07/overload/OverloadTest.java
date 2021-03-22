/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch07.overload;

/**
 *
 * @author Omar
 */
public class OverloadTest {
/*
    public void metodo(short num) {
        System.out.println("En short");
    }

    public void metodo(Integer num) {
        System.out.println("En Integer");
    }
*/
    public void fly(Object o) {
        System.out.print("object ");
    }
    
    public void fly(Number s) {
        System.out.print("number ");
    }
    
    public void fly(int n) {
        System.out.print("integer ");
    }


    public static void main(String[] args) {
        OverloadTest t = new OverloadTest();
        //t.metodo(4);
        t.fly("45");
        t.fly(4);
        t.fly((Number)null);
        t.fly(Integer.valueOf("2"));
    }
}
