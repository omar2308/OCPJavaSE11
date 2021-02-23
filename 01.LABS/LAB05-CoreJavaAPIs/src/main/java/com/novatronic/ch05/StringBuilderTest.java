/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

/**
 *
 * @author Omar
 */
public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb);      // 1c-true

    }
}
