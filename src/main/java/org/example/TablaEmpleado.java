package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TablaEmpleado {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(
                DBConfig.getUrl(),
                DBConfig.getUser(),
                DBConfig.getPassword());
            Statement stmt = conn.createStatement()) {
            System.out.println("Conexion exitosa");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}