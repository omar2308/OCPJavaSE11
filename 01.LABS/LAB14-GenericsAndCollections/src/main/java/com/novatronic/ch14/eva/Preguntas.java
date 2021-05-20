/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch14.eva;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Omar
 */
public class Preguntas {
    public static <T extends  Number, A> void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        A a;
        Object re = Preguntas.<Object>metodo("");
        
        List<Object> listaObj = new ArrayList<>();
        listaObj.add("");
        List<?> listaObj2 = lista;
        //listaObj2.add("");
        
        call(lista);
        call(listaObj);
    }
    
    public static void call(List<? super String> lista){
        lista.add("2");
    }
    
    public static <T> T metodo(T dato){
        return dato;
    }
}

class X<T extends String, H>{
    
}

class S implements Comparable<S>, Comparator<S>{

    @Override
    public int compareTo(S arg0) {
        return 1;
    }

    @Override
    public int compare(S arg0, S arg1) {
        return 1;
    }
    
}
