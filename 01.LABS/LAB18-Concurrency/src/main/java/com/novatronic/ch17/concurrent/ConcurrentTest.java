/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Omar
 */
public class ConcurrentTest {

    public static void main(String[] args) {
        //Map<String, Integer> foodData = new ConcurrentSkipListMap<>();
        Map<String, Integer> foodData = new ConcurrentHashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet()) {
            foodData.remove(key);
        }
        
        
    }
}
