/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Omar
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(5);
        cola.offer(2);
        cola.offer(7);
        System.out.println(cola);
        System.out.println(cola.peek());
        System.out.println(cola);
        System.out.println(cola.poll());
        System.out.println(cola);
    }
}
