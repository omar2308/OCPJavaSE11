/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Omar
 */
public class DBConnectionTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //String url = "jdbc:derby:zoo";
        //String url = "jdbc:oracle:thin:@localhost:1521:oralin74";
        String url = "jdbc:mysql://localhost:3306/ocp11";
        String user = "ocp";
        String pass = "0Cp$_11";
        
        // Esto era antes
        //Class.forName("oracle.jdbc.OracleDriver");
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Tengo la conexion!");
        }
    }
}


//JPA
//  ----- Implementador: Hibernate, ibatis, eclipseLink...
//JDBC -> drivers, query, sttement, calleable
