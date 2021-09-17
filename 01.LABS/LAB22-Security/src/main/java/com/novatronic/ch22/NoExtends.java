/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch22;

import java.util.Map;

/**
 *
 * @author Omar
 */
public final class NoExtends {
    private Map<String, String> datos;
    
    public boolean isDataValid(String key){
        return datos.containsKey(key);
    }
}

/*
class HackjackinNoExtends extends NoExtends{

    @Override
    public boolean isDataValid(String key) {
        boolean result = super.isDataValid(key);
        //guardar key y data ->
        return result;
    }
}
*/
