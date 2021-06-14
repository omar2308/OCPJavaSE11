/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16;

/**
 *
 * @author Omar
 */
public class CustomException {
    public static void main(String[] args) {
        throw new MyException("ss");
    }
}

class MyException extends RuntimeException{

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}

class MyException2 extends Exception{

    public MyException2() {
    }

    public MyException2(String message) {
        super(message);
    }

    public MyException2(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException2(Throwable cause) {
        super(cause);
    }
    
}
