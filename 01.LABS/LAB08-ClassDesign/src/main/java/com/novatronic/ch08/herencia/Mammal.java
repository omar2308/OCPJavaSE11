/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch08.herencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class Mammal {

    protected List<Number> play() {
        return null;
    }
}

class Mokey extends Mammal{
    public ArrayList<Number> play() {
        return null;
    }
}

class Goat extends Mammal{
    protected ArrayList<Number> play() {
        return null;
    }
}
