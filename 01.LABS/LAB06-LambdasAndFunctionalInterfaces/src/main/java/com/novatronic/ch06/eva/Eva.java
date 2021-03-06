/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch06.eva;

import java.util.function.Predicate;

/**
 *
 * @author Omar
 */
public class Eva {
    public static void main(String[] args) {
        
    }
    
    public void metodo(String param1, String param2){
        String local1 = param1 + param2;
        String local2 = local1 + param2;
        //local2 = null;
        Predicate<String> p = x -> {
            x = local1;
            x = local2;
            x = param1;
            x = param2;
            return x.isEmpty();};
        //local2 = null;
        //param1 = null;
        
        Predicate<String> h = x -> { return true;};
        
        Secret secret = (a, b) -> a + b;
        
        StringBuilder s;
        //s.isEmpty() // No existe
    }
}

interface Secret {
    String concat(String a, String b);
}

