/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.inner;

/**
 *
 * @author Omar
 */
public class Enclosing {
    private int id = 2;
    private static int staticid = 3;
    static class Nested{
        private int price = 6;
        public void chage(){
            staticid = 3;
        }
    }
    public void algo(){
        Nested nested = new Nested();
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.price = 7;
    }
}
