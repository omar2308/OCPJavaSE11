/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch12.enums;

/**
 *
 * @author Omar
 */
public class ConSwitch {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        switch(s){
            case FALL:  // No se puede asi: case Season.FALL:
                System.out.println("Es Summer");
                break;
            case SPRING:
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("??");
        }
    }
}
