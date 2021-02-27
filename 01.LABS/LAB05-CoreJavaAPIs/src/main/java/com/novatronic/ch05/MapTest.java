/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch05;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Omar
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("01", "Hola");
        mapa.put("02", "Mundo");
        System.out.println(mapa);
        System.out.println(mapa.getOrDefault("03", "todos"));
        System.out.println(mapa);
    }
}
