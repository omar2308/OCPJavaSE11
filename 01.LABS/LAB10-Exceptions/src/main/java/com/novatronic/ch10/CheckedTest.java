/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch10;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Omar
 */
public class CheckedTest {

    public CheckedTest() throws IOException{
        
    }
    void fall(int distance) {
        try {
            if (distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fall2(int distance) throws ArithmeticException {
        if (distance > 10) {
            Object e = new IOException();
            //throw e; //No compila
            //throw (FileNotFoundException)e;
            throw new NullPointerException();
            //throw new IOException();
        }
    }
    
    public static void main(String[] args) throws IOException {
        CheckedTest ch = new CheckedTest();
        int[] nums = {3,2};
    }
}
