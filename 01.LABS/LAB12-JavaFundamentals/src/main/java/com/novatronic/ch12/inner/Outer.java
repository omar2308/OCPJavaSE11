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
public class Outer {
    private String greeting = "hi";
    public Outer(String greeting){ this.greeting = greeting;}
    protected class Inner{
        public int repeat = 3;
        private int id;
        public Inner(int id){ this.id = id;}
        public void go(){
            greeting = greeting + "+" + id;
            for (int i = 0; i < repeat; i++) {
                System.out.println(id + "-" + greeting);
            }
        }
    }
    
    public void callInner(){
        Inner inner = new Inner(0);
        inner.id = 8;
        inner.go();
    }
    public static void main(String[] args) {
        Outer outer = new Outer("Hi0");
        outer.callInner();
        //Compila:
        //Outer$Inner.class
        Inner inner1 = outer.new Inner(1);
        inner1.go();
        inner1.go();
        
        Inner inner2 = new Outer("Hi1").new Inner(2);
        inner2.go();
    }
}
