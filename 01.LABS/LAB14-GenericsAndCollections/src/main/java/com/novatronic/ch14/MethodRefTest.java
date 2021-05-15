/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author Omar
 */
public class MethodRefTest {
    public static void main(String[] args) {
        LearnToSpeake learner = System.out::println;
        LearnToSpeake learner1 = (s) -> System.out.println(s);
        
        DuckerHelper duck = new DuckerHelper();
        duck.teacher("Dennys", learner);
        duck.teacher("Miguel", (s) -> System.out.println(s));
        duck.teacher("Miguel", System.out::println);
        
        Consumer<List<String>> c = Collections::sort;
        
        String str = "abc";
        Predicate<String> p = str::startsWith;
        System.out.println("p:" + p.test("a"));
        //Predicate<String> pa = s -> str.startsWith(s);
        //System.out.println("pa:" + pa.test("a"));
        
        str = "dd";
        System.out.println("p:" + p.test("a"));
        
        Hello hello = new Hello("Pedro");
        Predicate<String> pb = hello::habla;
        System.out.println("pb:" + pb.test("P"));
        hello.setName("Luis");
        hello = new Hello("Miguel");
        System.out.println("pb:" + pb.test("P"));
        System.out.println("pb:" + pb.test("L"));
        
        System.out.println("----------------");
        Predicate<String> pc = String::isEmpty;
        Predicate<String> pd = s -> s.isEmpty();
        BiPredicate<String, String> bpa = String::startsWith;
        BiPredicate<String, String> bpb = (a,b) -> a.startsWith(b);
        
        System.out.println("--------------------");
        Supplier<List<String>> sup = ArrayList::new;
        Supplier<List<String>> supa = () -> new ArrayList<>();
        
        Function<Integer, List<String>> fun = ArrayList::new;
        
        Function<String, Hello> fun2 = Hello::new;
        //Function<String, Hello2> fun3 = Hello2::new;
        Supplier<Hello> fun3 = Hello::new;
        
    }
}

class Hello2{
}

class Hello{
    private String name;
    
    public Hello(){    
    }
    public Hello(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    boolean habla(String str){
        System.out.println("call me");
        return name.startsWith(str);
    }
}

@FunctionalInterface
interface LearnToSpeake{
    void speak(String s);
}

class DuckerHelper{
    public void teacher(String name, LearnToSpeake trainer){
        trainer.speak(name);
    }
}
