/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.chr1.functions;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Omar
 */
public class FunctionalTest {
    private String local = "";

    public FunctionalTest() {
    }
    
    public FunctionalTest(String local) {
        this.local = local;
    }
    
    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());

        String s1 = "egg";
        System.out.println(brownEggs.test(s1));
        System.out.println(egg.test(s1));
        

        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.print(",2: " + x);
        Consumer<String> combinedc = c1.andThen(c2);
        combinedc.accept("Annie");              // 1: Annie,2: Annie

        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combinedf = after.compose(before);
        System.out.println(combinedf.apply(3));   // 8
        
        String value = null;
        Optional opt = Optional.ofNullable(value);
        
        BinaryOperator<String> bo = (s, c) -> s+c;
        BinaryOperator<String> bo1 = String::concat;
        BinaryOperator<FunctionalTest> bo2 = FunctionalTest::agrega;
        FunctionalTest ft = bo2.apply(new FunctionalTest("a"), new FunctionalTest("b"));
        System.out.println(ft);

    }
    
    public FunctionalTest agrega(FunctionalTest value){
        System.out.println("...local:" + local + ", value:" + value);
        return new FunctionalTest(local + value);
    }

    @Override
    public String toString() {
        return "FunctionalTest{" + "local=" + local + '}';
    }
    
}
