/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08.hidden;

/**
 *
 * @author Omar
 */
class Carnivore {
    protected boolean hasFur = false;
    public static int NUM = 2;
}

public class Meerkat extends Carnivore {
    public static int NUM = 3;
    protected boolean hasFur = true;
    
    public void metodo(boolean hasFur){
        System.out.println("hasFur:" + hasFur);
        
        //boolean hasFur = true;
    }

    public static void main(String[] args) {
        Meerkat m = new Meerkat();
        Carnivore c = m;
        System.out.println(m.hasFur);
        System.out.println(c.hasFur);
        System.out.println(m.NUM);
        System.out.println(c.NUM);
    }
}
