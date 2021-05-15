/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Omar
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> conj = Set.of("a", "b", "c");
        System.out.println(conj);
        
        Set<String> conj1 = new HashSet<>();
        conj1.add("a");
        conj1.add("b");
        conj1.add("c");
        conj1.add("d");
        conj1.add("e");
        System.out.println(conj1);
        
        Set<String> conj2 = new TreeSet<>();
        conj2.add("a");
        conj2.add("b");
        conj2.add("c");
        conj2.add("d");
        conj2.add("e");
        System.out.println(conj2);
        
        Set<A> conj3 = new TreeSet<>((a,b) -> -1);
        conj3.add(new A("a"));
        //System.out.println(conj3);
    }
}

class A{
    private String name;
    public A(String name) {
        this.name = name;
    }
}
