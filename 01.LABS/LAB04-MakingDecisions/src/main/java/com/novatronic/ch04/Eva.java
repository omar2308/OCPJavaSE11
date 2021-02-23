/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class Eva {

    public static void main(String[] args) {
        for (var penguin : new int[2]) {
            System.out.println(penguin);
        }

        var ostrich = new Character[3];
        for (var emu : ostrich) {
            System.out.println(emu);
        }

        List parrots = new ArrayList();
        for (var macaw : parrots) {
            System.out.println(macaw);
        }

    }
}
