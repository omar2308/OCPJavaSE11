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
public class ExecuteColNamesTest {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ocp11";
    private static final String JDBC__USER = "ocp";
    private static final String JDBC_PASS = "0Cp$_11";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String sql_0 = "SELECT count(*) as count FROM productos";
        String sql_1 = "SELECT id as MYID, nombre as NAME FROM productos WHERE id = ?";
        String sql_2 = "SELECT id as MYID, nombre as NAME FROM productos";
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC__USER, JDBC_PASS);
                PreparedStatement ps = conn.prepareStatement(sql_1)) {
            
            ps.setInt(1, 3);   // Bind value
            
            try(ResultSet rs = ps.executeQuery();){
                //id, nombre, marca, modelo, nro_parte, precio_venta, notas
                while (rs.next()) {
                    System.out.println(
                            rs.getMetaData().getColumnName(1) + " - " +
                            rs.getMetaData().getColumnLabel(1) + " | " +
                            rs.getMetaData().getColumnName(2) + " - " +
                            rs.getMetaData().getColumnLabel(2) + " | ");
                    Object obj1 = rs.getObject("MYID");
                    Object obj2 = rs.getObject("NAME");
                    System.out.println(
                            obj1 + " - " + obj1.getClass() + "\t" +
                            obj2 + " - " + obj2.getClass());
                }
            }
            //tener cuidado con estas sentencias
//            rs.next();
//            System.out.println(rs.getObject(1));
        }
    }
}
