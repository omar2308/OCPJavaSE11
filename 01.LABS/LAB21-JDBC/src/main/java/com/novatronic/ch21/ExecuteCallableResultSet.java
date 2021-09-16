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
public class ExecuteCallableResultSet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ocp11";
    private static final String JDBC__USER = "ocp";
    private static final String JDBC_PASS = "0Cp$_11";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String callSql = "{ call products_get(?) }";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC__USER, JDBC_PASS);
                CallableStatement cs = conn.prepareCall(callSql)) {

            cs.setString(1, "ant");

            boolean result = cs.execute();
            System.out.println("result:" + result);

            if (result) {
                try (ResultSet rs = cs.getResultSet()) {
                    showColumnsNames(rs);
                    while(rs.next()){
                        System.out.print(rs.getInt("id") + "\t");
                        System.out.print(rs.getString("nombre") + "\t");
                        System.out.print(rs.getString("marca") + "\t");
                        System.out.print(rs.getString("modelo") + "\t");
                        System.out.print(rs.getString("nro_parte") + "\t");
                        System.out.print(rs.getString("precio_venta") + "\t");
                        System.out.println(rs.getString("notas"));
                    }
                }
            }
            //System.out.println(cs.getObject(2));

        } catch(SQLException ex){
            System.out.println("");
            System.out.println("message:" + ex.getMessage());
            System.out.println("SQLState:" + ex.getSQLState());
            System.out.println("ErrorCode:" + ex.getErrorCode());
            ex.printStackTrace();
        }
    }

    private static void showColumnsNames(ResultSet rs) throws SQLException {
        int count = rs.getMetaData().getColumnCount();
        System.out.println("count:" + count);
        for (int i = 1; i < count + 1; i++) {
            System.out.println("Name:"
                    + rs.getMetaData().getColumnName(i)
                    + ", label:"
                    + rs.getMetaData().getColumnLabel(i));
        }
    }
}
