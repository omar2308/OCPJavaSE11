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
public class A {
    private  int x = 10;
    class B {
        private int x = 20;
        class C{
            private int x = 30;
            public void allTheX(){
                int x = 1;
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(B.this.x);
                System.out.println(A.this.x);
            }
        }
    }
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.allTheX();
    }
}
