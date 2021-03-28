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
public class CheckedTest {

    void fall(int distance) {
        try {
            if (distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fall2(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }
}
