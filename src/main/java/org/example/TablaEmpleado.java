package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjemploMaven {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(
                DBConfig.getUrl(),
                DBConfig.getUser(),
                DBConfig.getPassword())) {
            System.out.println("Conexion establecida");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}