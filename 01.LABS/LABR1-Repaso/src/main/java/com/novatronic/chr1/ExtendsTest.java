/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.chr1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class ExtendsTest {
    public static void main(String[] args) {
        CA ca = new CA();
        algo(3);
    }
    
    public static void algo(Number b){
        
    }
    
    public static void metodo(List<Number> lista){
        Number n = Integer.valueOf(2);
        
        //lista.add((Object)n);
    }
    
    public static void metodo2(List<? extends Number> lista){
        lista = new ArrayList<Integer>();
        
        Integer n = Integer.valueOf(2);
        //lista.add(n);
    }
}

// ? extends ClaseBase  --> No modificable
// ? super ClaseBase
class CA<T>{
    private T data;
    
    public T getData(){
        return data;
    }
}



class CB{
    public <T> T get(T t){
        return t;
    }
}
