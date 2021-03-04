/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch06;

import java.util.function.Supplier;

/**
 *
 * @author Omar
 */
public class SupplierTest {
    public static void main(String[] args) {
        ejecuta(() -> "devuelto luego de llamar a un servicio REST");
    }
    
    public static void ejecuta(Supplier<String> s){
        System.out.println("s:" + s.get());
    }
}
