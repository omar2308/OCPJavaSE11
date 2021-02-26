/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

/**
 *
 * @author Omar
 */
public class StringPoolTest {

    public static void main(String[] args) {
        String a = "Hello World";
        metodo("Hello World");
        metodo(a);
        System.out.println("-----------");
        usandoIntern();
    }

    public static void metodo(String z) {
        String b = "Hello World";
        System.out.println(z == b);
    }

    private static void usandoIntern() {
        String first = "rat" + 1;
        String second = "r" + "a" + "t" + "1";
        String third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);
        System.out.println(first == second.intern());
        System.out.println(first == third);
        System.out.println(first == third.intern());
        System.out.println(first == third);
    }
}
