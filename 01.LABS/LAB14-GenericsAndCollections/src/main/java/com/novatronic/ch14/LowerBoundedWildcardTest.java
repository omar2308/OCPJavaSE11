/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import static com.novatronic.ch14.UpperBoundedWildcardTest.call;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class LowerBoundedWildcardTest {
    public static void main(String[] args) {
        List<Number> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        call(lista);
        List<? extends Number> lista1;
    }
    
    public static <T,A extends T> T first(List<? extends T> lista){
        return lista.get(0);
    }
    
    //B se refiere al tipo generico
    public <B extends AA> B third(List<B> lista){
        return lista.get(0);
        //return new B();
        //return new com.novatronic.ch14.B();
    }
    
    public static void call(List<? super Integer> lista){
        for (Object object : lista) {
            
        }
        Integer obj = 2;
        lista.add(obj);
        lista.add(2);
        //lista.add(n);
    }
}

class AA{}
    
