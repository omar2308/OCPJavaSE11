/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 *
 * @author Omar
 */
public class MapMergeTest {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("key01", "Manuel");
        mapa.put("key02", "Pedrito");
        mapa.put("key03", "Marquinnho");
        mapa.put("key04", null);
        
        //(Value2, Value2), newV_posible
        BiFunction<String, String, String> bfunc = 
                (v1,v2) -> {
                    System.out.println("v1:" + v1);
                    System.out.println("v2:" + v2);
                    return "otro";
                };
        System.out.println(mapa);
        
        
        String result = mapa.merge("key01", "newManuel", bfunc);
        System.out.println("result:" + result);
        System.out.println(mapa);
        
        result = mapa.merge("key04", "newManuel", bfunc);
        System.out.println("result:" + result);
        System.out.println(mapa);
        
        BiFunction<String, String, String> bfunc2 = 
                (v1,v2) -> {
                    System.out.println("On BFunction");
                    return null;
                };
        result = mapa.merge("key02", "newManuel", bfunc2);
        System.out.println("result:" + result);
        System.out.println(mapa);
        
        
    }
}
