/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch09.interf;

/**
 *
 * @author Omar
 */
public interface IA {
    Number metodo();
}

interface IB{
    Integer metodo();
}

interface IC extends IA, IB{}
