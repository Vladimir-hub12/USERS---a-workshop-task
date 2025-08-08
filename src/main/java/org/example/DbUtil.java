package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    public static Connection connect() throws SQLException {
        final String url="jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8";
        final String user="root";
        final String password="coderslab";
        return DriverManager.getConnection(url,user,password
        );
    }
}
