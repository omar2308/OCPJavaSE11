/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

/**
 *
 * @author Omar
 */
public class MultiCatchTest {

    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt(args[1]));

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {

            System.out.println("Missing or invalid input");
        } catch (IllegalArgumentException e) {

            System.out.println("Missing or invalid input");
        }
    }
    
    public void metodo1(){
        try {
            
        } catch (AAA e) {
        } catch (AA e) {
        }
    }
    
    /* No es posible por herencia entre AA y AAA
    public void metodo2(){
        try {
            
        } catch (AAA | AA e) {
        }
    }
    */
    
    public void doesNotCompile() { // METHOD DOES NOT COMPILE
        try {
           mightThrow();
        } catch (FileNotFoundException | IllegalStateException e) {
        } catch (InputMismatchException | MissingResourceException e) {
        //} catch (FileNotFoundException | IllegalArgumentException e) {
        } catch (IOException e) {
        } catch (Exception e) {
        }
     }
     private void mightThrow() throws DateTimeParseException, IOException { }
}

class AA extends RuntimeException {}
class AAA extends AA {}