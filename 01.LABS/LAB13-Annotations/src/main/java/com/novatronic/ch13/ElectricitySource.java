/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch13;

/**
 *
 * @author Omar
 */
public @interface ElectricitySource {
    public int volatage();
    int MIN_VOLATGE = 2;
    public static final int MAX_VOLTAGE = 18;
}
