/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

/**
 *
 * @author Omar
 */
public class ExceptionBasicTest {
    public static void main(String[] args) {
        try {
            InputStream f = new FileInputStream(".");
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        }finally{
            System.out.println("3");
        }
        
        System.out.println("---------------");
        try {
            metodo2();
        } catch (Exception e) {
            System.out.println("4");
            e.printStackTrace();
        }
    }
    
    public void metodo() throws IllegalArgumentException, IOException, 
            FileNotFoundException, Error{
        try {
            IOException e = new IOException();
            throw e;
        } catch (IOException e) {
        } catch (Error e) {
        }
    }
    
    public static void metodo2(){
        try {
            throw new IllegalArgumentException("EX-1");
        } catch (Exception e) {
            throw new IllegalArgumentException("EX-2", e);
        } finally{
            throw new IllegalArgumentException("EX-3");
        }
    }
}
