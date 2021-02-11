/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch03;

/**
 *
 * @author Omar
 */
public class Binarios {
    public static void main(String[] args) {
        float d = 3.0F;
        long x = 9999999999L;
        
        byte b = 12*10;  //Para el compilador esto es 120
        int e = 999999999;
        short c = 999;
        
        byte m = 1;
        byte n = 30;
        //byte p = 3*n;
        
        int a1 = 999999999;
        int a2 = 999999999;
        long h = a1*a2;
        System.out.println("h:" + h);
        
        float b1= 3.0f;
        float b2= 4.0f;
        float b3 = b1*b2;
        
        int c1 = 3;
        float c2 = 4.0f;
        double c3 =c1*c2;
        
        int d1 = 3;
        long d2 = 10;
        float d3 = 6.0f;
        double d4 = d3*d2/d1;
        double d5 = d2/d1*d3;
        System.out.println("d4:" + d4);
        System.out.println("d4:" + d5);
        
        long manager = 192301398193810323L;
        
    }
}
