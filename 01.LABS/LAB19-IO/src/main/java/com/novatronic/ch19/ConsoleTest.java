/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch19;

import java.io.Console;

/**
 *
 * @author Omar
 */
public class ConsoleTest {
    public static void main(String[] args) {
        Console console =System.console();
        if(console != null){
            String texto = console.readLine();
            console.writer().format("Ingresaste[%s]", texto);
        }else{
            System.err.println("No tenemos acceso a la consola");
        }
    }
}
