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
public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb);      // 1c-true

        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "HolaPirata");
        System.out.println(builder);  // pigsty dirty

        System.out.println("--------------------");
        String x = "Hello World";
        String y = "Hello World ".trim();
        System.out.println(x == y);
        System.out.println(x.equals(y));
        
        System.out.println("----------------");
        String a = "Hello World";
        String b = "World";
        a = a.substring(6);
        System.out.println("a:" + a);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        
        System.out.println("-------------");
        String m = "XX";
        String n = "XX";
        System.out.println(m == n);

    }
}
