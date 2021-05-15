/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch13;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Omar
 */
public class AnnotationTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //AnnotationTest test = new AnnotationTest();
        IA ia = (IA)Class.forName("com.novatronic.ch13.A").getConstructor().newInstance();
        IA ia2 = new A2();
        System.out.println(ia);
        
    }
}


interface IA{}

class A implements IA{
    public A(){}
    @Override
    public String toString() {
        return "A{" + '}';
    }
    
}
class A2 implements IA{}