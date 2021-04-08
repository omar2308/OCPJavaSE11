/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch10.eva;

/**
 *
 * @author Omar
 */
public class Preg09 {

    void rollOut() throws ClassCastException {
    }

    public void transform(String c) {
        try {
            rollOut();
        //} catch (IllegalArgumentException | NumberFormatException  d) {
        } catch (IllegalArgumentException | ClassCastException  d) {
        }
    }

}
