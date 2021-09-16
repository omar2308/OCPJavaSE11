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
public class ExecuteSelectTest {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ocp11";
    private static final String JDBC__USER = "ocp";
    private static final String JDBC_PASS = "0Cp$_11";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM productos where id = ?";
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC__USER, JDBC_PASS);
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, 3);
            ResultSet rs = ps.executeQuery();
            
            //id, nombre, marca, modelo, nro_parte, precio_venta, notas
            while (rs.next()) {
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString("marca"));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(6));
                System.out.println(rs.getString(7));
            }
        }
    }
}
