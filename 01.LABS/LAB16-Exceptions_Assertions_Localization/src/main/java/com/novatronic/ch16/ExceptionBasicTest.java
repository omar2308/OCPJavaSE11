/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Omar
 */
public class ExceptionBasicTest {
    public static void main(String[] args) {
        try {
            InputStream f = new FileInputStream("");
        } catch (IOException e) {
            //algo
        } catch (Exception e) {
            //algo
        }finally{
            //algo
        }
    }
}
