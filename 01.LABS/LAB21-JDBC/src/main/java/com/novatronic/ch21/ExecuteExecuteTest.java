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
public class ExecuteExecuteTest {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ocp11";
    private static final String JDBC__USER = "ocp";
    private static final String JDBC_PASS = "0Cp$_11";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        String selectSql = "SELECT id as MYID, nombre as NAME FROM productos where id = ?";
        String updateSql = "UPDATE productos SET nombre = 'Yanta' WHERE  id = ?";
        
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC__USER, JDBC_PASS)) {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            //ps.setInt(1, 3);
            ps.setObject(1, 3);
            boolean result = ps.execute();
            System.out.println("result:" + result);
            
            if(result){
                ResultSet rs = ps.getResultSet();
                //id, nombre, marca, modelo, nro_parte, precio_venta, notas
                while (rs.next()) {
                    System.out.println("N. Columns:" + rs.getMetaData().getColumnCount());
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                        System.out.println(
                                "C.Name:" + rs.getMetaData().getColumnName(i) 
                                        + "|C.Label:" + rs.getMetaData().getColumnLabel(i) 
                                        + "->" 
                                        + rs.getObject(i));
                    }
                }
            }else{
                int cant = ps.getUpdateCount();
                System.out.println("cant:" + cant);
            }
            
        }
    }
}
