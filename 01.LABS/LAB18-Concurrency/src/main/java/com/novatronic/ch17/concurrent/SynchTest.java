/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17.concurrent;

import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Omar
 */
public class SynchTest {

    public static void main(String[] args) {
        var foodData = new HashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        var synFoodData = Collections.synchronizedMap(foodData);
        for (String key : synFoodData.keySet()) {
            synFoodData.remove(key);
        }
    }
}
