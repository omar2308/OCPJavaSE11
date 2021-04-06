/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch10.close;

/**
 *
 * @author Omar
 */
public class MyFileClass implements AutoCloseable {
    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    public void close() {
        System.out.println("Closing: " + num);
    }

    public static void main(String... xyz) {
        try ( MyFileClass a1 = new MyFileClass(1);  MyFileClass a2 = new MyFileClass(2);) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("en catch");
        } finally {
            System.out.println("en finally");
        }
    }
}
