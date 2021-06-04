/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Omar
 */
public class TryResourcesTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (var in = new FileInputStream("..");
                var out = new FileOutputStream("..");){
            
        } catch(Exception e){
            
        }
    }
}
