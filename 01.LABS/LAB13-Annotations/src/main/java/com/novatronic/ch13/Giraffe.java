/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch13;

/**
 *
 * @author Omar
 */
public class Giraffe {
    @Music(genres = {"Rock", "Balada"}) String mostDisliked;
    @Music(genres = "Classical") String favorite;
}

@interface Music{
    String[] genres();
}
