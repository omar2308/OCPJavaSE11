/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14.eva;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Omar
 */
public class Eva {

    public static void main(String[] args) {
        List<?> q = List.of("mouse", "parrot");
        //System.out.println(q.removeIf(String::isEmpty));

        var map = Map.of(1, 2, 3, 6);
        var list = List.copyOf(map.entrySet());

        List<Integer> one = List.of(8, 16, 2);
        var copy = List.copyOf(one);
        var copyOfCopy = List.copyOf(copy);
        var thirdCopy = new ArrayList<>(copyOfCopy);

        //list.replaceAll(x -> x * 2);
        one.replaceAll(x -> x * 2);
        thirdCopy.replaceAll(x -> x * 2);

        System.out.println(thirdCopy);
    }
}
