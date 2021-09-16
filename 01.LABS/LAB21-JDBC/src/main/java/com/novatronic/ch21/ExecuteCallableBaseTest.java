/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch21;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author Omar
 */
public class ExecuteCallableBaseTest {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ocp11";
    private static final String JDBC__USER = "ocp";
    private static final String JDBC_PASS = "0Cp$_11";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        String callSql = "{ call products_count(?, ?) }";
        
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC__USER, JDBC_PASS);
                CallableStatement cs = conn.prepareCall(callSql)) {
            
            cs.setString(1, "ant");
            cs.registerOutParameter(2, Types.INTEGER);
            
            boolean result = cs.execute();
            System.out.println("result:" + result);
            System.out.println(cs.getObject(2));
            
        }
    }
}
