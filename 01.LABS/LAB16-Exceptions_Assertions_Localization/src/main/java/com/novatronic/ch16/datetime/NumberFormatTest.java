/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16.datetime;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author Omar
 */
public class NumberFormatTest {
    public static void main(String[] args) throws ParseException {
        NumberFormat.getInstance();
        int value = 3_200_00;
        double div = value / 12;
        
        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(div));
        
        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(div));
        
        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(div));
        
        double price = 56;
        var lo = NumberFormat.getCurrencyInstance();
        System.out.println(lo.format(price));
        
        System.out.println("--------------");
        String num = "40,45";
        var en = NumberFormat.getInstance(Locale.US);
        System.out.println(en.parse(num));
        
        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.format(40.45));
        System.out.println(fr.parse(num));
        
        String income = "S/92,807.98";
        var cf = NumberFormat.getCurrencyInstance(); //Estamos es_PE
        System.out.println(cf.parse(income));
        
    }
}
