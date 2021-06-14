/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16.datetime;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Omar
 */
public class CustomNumberFormatTest {
    public static void main(String[] args) {
        //# -> digitos si aparecen - opcional
        //0 -> debe ir unmero o 0 si no hay - obnligatorio
        double d = 1234567.467;
        NumberFormat f1 = new DecimalFormat("#,###.0000");
        System.out.println(f1.format(d));
        
        NumberFormat f2 = new DecimalFormat("$ #,###.##");
        System.out.println(f2.format(d));
        
        NumberFormat f3 = new DecimalFormat("$ 000,000,000.##");
        System.out.println(f3.format(d));
    }
}
