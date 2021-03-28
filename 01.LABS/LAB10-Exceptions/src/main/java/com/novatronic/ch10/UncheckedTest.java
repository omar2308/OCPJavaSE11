/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch10;

import java.io.IOException;

/**
 *
 * @author Omar
 */
public class UncheckedTest {
    void fall2(int distance) /*throws NullPointerException */{
        if (distance > 10) {
            NullPointerException n = new NullPointerException();
            throw n;
        }
    }
}
