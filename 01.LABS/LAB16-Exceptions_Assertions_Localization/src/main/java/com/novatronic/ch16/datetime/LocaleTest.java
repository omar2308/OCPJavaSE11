/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author Omar
 */
public class LocaleTest {
    public static void main(String[] args) {
        //Language_Country
        Locale loc = Locale.getDefault();
        System.out.println(loc);
        
        var dtf = DateTimeFormatter.ofPattern("yyyy MMMM dd-EEEE hh:mm:ss");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.format(dtf));
        
        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);
        
        System.out.println(new Locale("es"));
        System.out.println(new Locale("es", "PE"));
        Locale lc1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        System.out.println(lc1);
        
        Locale.setDefault(lc1);
        System.out.println(Locale.getDefault());
    }
}
