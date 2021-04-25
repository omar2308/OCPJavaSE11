/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.local;

/**
 *
 * @author Omar
 */
public class PrintNumbers {
    private int length = 5;
    private Object local;
    public void calculate(){
        final int width = 10;
        //width = 20;
        //width = 10;
        int height = 3;
        class MyLocalClass{
            public void multiply(){
                System.out.println(length * width);
                System.out.println("height:" + height);
                length = 4;
            }
        }
        //height = 32;
        //width = 10;
        MyLocalClass local = new MyLocalClass();
        this.local = local;
        local.multiply();
    }

    public void setLength(int length) { this.length = length; }
    
    public void algo(){
        //MyLocalClass local = new MyLocalClass();
    }
    
    public static void main(String[] args) {
        PrintNumbers outer = new PrintNumbers();
        outer.calculate();
    }
}
