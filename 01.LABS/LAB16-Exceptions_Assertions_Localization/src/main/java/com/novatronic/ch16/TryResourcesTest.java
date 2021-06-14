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
public class TryResourcesTest {
    public static void main(String[] args) {
        final var in1 = new MyArch("X1");
        var in2 = new MyArch("X2");
        try (in1;in2){
            System.out.println("1");
            throw new IllegalStateException("ex");
        } catch(IllegalArgumentException e){
            System.out.println("2");
            for (Throwable arg : e.getSuppressed()) {
                System.out.println("arg:" + arg);
            }
        } catch(NullPointerException e){
            System.out.println("3");
        } finally{
            System.out.println("4");
            //throw new IllegalStateException("Finally");
        }
        in2.toString();
    }    
}

class MyArch implements AutoCloseable{
    private String name;

    public MyArch(String name) {
        this.name = name;
    }
    
    @Override
    public void close() {
        System.out.println("Cerrando..." + name);
        //throw new NullPointerException("close:" + name);
    }
    
}