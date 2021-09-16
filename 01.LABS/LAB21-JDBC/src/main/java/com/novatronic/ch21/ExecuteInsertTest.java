/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Omar
 */
public class ExecuteInsertTest {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ocp11";
    private static final String JDBC__USER = "ocp";
    private static final String JDBC_PASS = "0Cp$_11";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String insertSql = "INSERT INTO productos VALUES (NULL, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC__USER, JDBC_PASS);
                PreparedStatement ps = conn.prepareStatement(insertSql)) {
            
            ps.setString(1, "Llanta");
            ps.setString(2, "LL-0002A");
            ps.setString(3, "LL001");
            ps.setString(4, "ST-001");
            ps.setDouble(5, 110.55);
            ps.setString(6, "Llantas al por mayor");
            int result = ps.executeUpdate();
            System.out.println("result:" + result);
            //id, nombre, marca, modelo, nro_parte, precio_venta, notas
            
        }
    }
}
