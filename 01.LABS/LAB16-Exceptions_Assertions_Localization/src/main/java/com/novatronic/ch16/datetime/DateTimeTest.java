/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Omar
 */
public class DateTimeTest {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        
        LocalDate ld = LocalDate.of(2021, Month.JUNE, 7);
        System.out.println("ld:" + ld);
        LocalTime lt = LocalTime.of(19, 24, 30, 200);
        System.out.println("lt:" + lt);
        
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        System.out.println("ldt:" + ldt);
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getDayOfYear());
        
        System.out.println(ld.format(DateTimeFormatter.ISO_LOCAL_DATE));
        /*
        y: anno
        M: mes
        d: dia
        h: hora
        m: Minute
        s: Segundo
        a: a.m/p.m
        z: Nombre Time Zone
        Z: offset: -0500
        */
        var dfmt = DateTimeFormatter.ofPattern("yy__MMMMM__E__ 'at''clock ' hh_a");
        System.out.println("-----");
        System.out.println("Format:" + ldt.format(dfmt));
        System.out.println("Otro formato:" + dfmt.format(ldt));
        
        //dfmt.p
        
    }
}
