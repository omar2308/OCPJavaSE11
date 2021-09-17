/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch22;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class Animal implements Cloneable{
    private final ArrayList<String> favoritefoods;
    
    public Animal(List<String> favoritefoods) {
        if(favoritefoods != null){
            this.favoritefoods = new ArrayList<>(favoritefoods);
        }else{
            throw new IllegalArgumentException("La lista no puede estar vacia");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ArrayList<String> cloneList = (ArrayList)favoritefoods.clone();
        return new Animal(cloneList);
    }
    
    
    
    
    public List<String> getFavoritesFoods(){
        return favoritefoods;
    }
    
    public List<String> getFavoritesFoods_v2(){
        return new ArrayList<>(this.favoritefoods);
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> favoritefoods = new ArrayList<>();
        Animal animal = new Animal(favoritefoods);
        favoritefoods.clear();   //la lista pasada la limiamos por fuera
        // version insegura
//        animal.getFavoritesFoods().clear();
//        animal.getFavoritesFoods().add("coco");
        
        animal.getFavoritesFoods_v2().clear();
        animal.getFavoritesFoods_v2().add("coco");
        
        
        animal.clone();
    }
}
