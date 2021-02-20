/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch04;

/**
 *
 * @author Omar
 */
public class LabelContinue {

    public static void main(String[] args) {
        CLEANING:
        for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if (stables == 'b' || leopard == 2) {
                    break CLEANING;
                }
                System.out.println("Cleaning: " + stables + "," + leopard);
            }

        }
    }

    private static int[] searchForValue(int[][] list, int v) {
        int[] result = null;
        FOR_SEARCH:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == v) {
                    result = new int[]{i, j};
                    //return null;
                    break FOR_SEARCH;
                    //System.out.println("");
                }
            }
        }
        return result;
    }

}
