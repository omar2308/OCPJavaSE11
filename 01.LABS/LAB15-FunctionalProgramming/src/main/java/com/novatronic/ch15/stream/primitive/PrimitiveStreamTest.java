/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch15.stream.primitive;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

/**
 *
 * @author Omar
 */
public class PrimitiveStreamTest {
    public static void main(String[] args) {
        DoubleStream.of(1.01, 1.1, 1.2, 2.5)
                .forEach(System.out::println);
        
        System.out.println("-----------");
        double max = DoubleStream.generate(Math::random)
                .limit(5)
                .max()
                .getAsDouble();
        System.out.println("max:" + max);
        
        DoubleSummaryStatistics stats = DoubleStream.of(1.01, 1.1, 1.2, 2.5)
                .summaryStatistics();
        double range = stats.getMax() - stats.getMin();
        System.out.println("range:" + range);
                //.forEach(System.out::println);
    }
}
