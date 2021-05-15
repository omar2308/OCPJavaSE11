/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Omar
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> mapa0 = Map.of(
                "key1", "value1",
                "key2", "value2");
        
        Map<String, String> mapa1 = new HashMap<>();
        
        Map<B, String> mapa2 = new TreeMap<>();
        mapa2.put(new B("A"), "A");
        mapa2.put(new B("B"), "B");
        
        Map<B, String> mapa3 = new TreeMap<>(new CB());
        mapa3.put(new B("1"), "1");
        mapa3.put(new B("2"), "2");
        
        Map<B, String> mapa4 = new TreeMap<>((a, b)-> b.getName().compareTo(a.getName()));
    }
}

class B implements Comparable<B>{
    private final String name;
    public B(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(B b) {
        return this.name.compareTo(b.name);
    }
    public String getName() {
        return name;
    }
}

class CB implements Comparator<B> {

    @Override
    public int compare(B arg0, B arg1) {
        return arg0.getName().compareTo(arg1.getName());
    }
    
}
