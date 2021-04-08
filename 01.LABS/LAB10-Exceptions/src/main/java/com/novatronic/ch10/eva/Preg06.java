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
public class Preg06 {
    public static void main(String[] args) {
        Preg06 p = new Preg06();
        MyException e = p.metodo();
        System.out.println("e:" + e);
    }
    public MyException metodo() throws MyException{
        return new MyException();
    }
}

class MyException extends RuntimeException{
    
}

