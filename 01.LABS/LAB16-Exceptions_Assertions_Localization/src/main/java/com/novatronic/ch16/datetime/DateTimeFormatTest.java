/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 *
 * @author Omar
 */
public class DateTimeFormatTest {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        var italy = new Locale("it", "IT");
        var dt = LocalDateTime.now();
        
        print(DateTimeFormatter
                .ofLocalizedDate(FormatStyle.SHORT), 
                dt, italy);
        print(DateTimeFormatter
                .ofLocalizedTime(FormatStyle.SHORT), 
                dt, italy);
        print(DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT), 
                dt, italy);
    }
    
    private static void print(DateTimeFormatter dtf, LocalDateTime dateTime, 
            Locale locale){
        System.out.println(dtf.format(dateTime) 
                + " - " 
                + dtf.withLocale(locale).format(dateTime));
    }
}
