/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch17.concurrent;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 *
 * @author Omar
 */
public class CopySetTest {

    public static void main(String[] args) {
        Set<Character> favLetters = new CopyOnWriteArraySet<>(List.of('a', 't'));
        for (char c : favLetters) {
            System.out.print(c + " ");
            favLetters.add('s');
        }
        System.out.println();
        System.out.println("Size: " + favLetters.size());
    }
}
