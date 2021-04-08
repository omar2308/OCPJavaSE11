/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch10.eva;

/**
 *
 * @author Omar
 */
public class Preg04 {

    public static void main(String[] args) {
        metodo(0, 0);
    }

    public static void metodo(int a, int b) {
        try {
            System.out.print(a / b);
        } catch (RuntimeException e) {
            System.out.print(-1);
//        } catch (ArithmeticException e) {
//            System.out.print(0);
        } 
        finally {
            System.out.print("done");
        }
    }

}
