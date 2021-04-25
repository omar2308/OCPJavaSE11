/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.chr1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Omar
 */
public class LocalTest {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();
        LocalDate date = LocalDate.from(datetime);
        LocalTime time = LocalTime.from(datetime);
        
        
    }
}
