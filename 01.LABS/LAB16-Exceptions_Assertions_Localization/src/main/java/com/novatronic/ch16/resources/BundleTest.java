/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16.resources;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Omar
 */
public class BundleTest {
    public static void main(String[] args) {
        var us = new Locale("en", "US");
        var fr = new Locale("fr", "FR");
        var it = new Locale("it", "IT");
        var xx = new Locale("xx");
        System.out.println("xx:" + xx);
        printWelcome(us);
        printWelcome(fr);
        printWelcome(xx);
        printWelcome(it);
        //Zoo_it_IT.properties
        //Zoo_it.properties
        //Zoo.properties
        printWelcome(us, "Leo", "André");
    }
    
    private static void printWelcome(Locale locale){
        var rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(
                rb.getString("hello")
                + " - "
                + rb.getString("open"));
    }
    
    private static void printWelcome(Locale locale, String name1,
            String name2){
        var rb = ResourceBundle.getBundle("Zoo", locale);
        String formatHello = rb.getString("hello");
        String formatOpen = rb.getString("open");
        System.out.println(
                MessageFormat.format(formatHello, name1, name2)
                + " - "
                + MessageFormat.format(formatOpen, name1, name2));
    }
}
