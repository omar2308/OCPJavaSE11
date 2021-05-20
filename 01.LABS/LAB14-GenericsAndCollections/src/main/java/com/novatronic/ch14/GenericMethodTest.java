/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

/**
 *
 * @author Omar
 */
public class GenericMethodTest {
    public static void main(String[] args) {
        Handler h = new Handler();
        Crate<String> create = calls("");
        
        Crate<String> create2 = GenericMethodTest.<String, String>calls("");
        
        Test<Integer> test = new Test<>(3);
        Object obj = test.tricky("hola");
        System.out.println("---------");
        System.out.println(obj instanceof String);
        System.out.println(obj instanceof Integer);
    }
    
    public static <T, u> Crate<T> calls(T name){
        Crate<String> crate = new Crate<>("");
        Crate<T> crate2 = new Crate<>(name);
        return crate2;
    }
}

class Test<T>{
    private T dato;

    public Test(T dato) {
        this.dato = dato;
    }
    public <T> T tricky(T t){
        System.out.println(dato instanceof Integer);
        System.out.println(dato instanceof String);
        System.out.println(t instanceof Integer);
        System.out.println(t instanceof String);
        return t;
    }
}

class Crate<T>{
    private T name;
    public Crate(T name){
        this.name = name;
    }
    
    public T getName(){
        return name;
    }
}

class Handler{
    public <T> void call(T name){
        
    }
}
