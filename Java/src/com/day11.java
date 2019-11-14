package com;

import java.sql.*;

public class day11 {
    public ResultSet result;
    public ResultSet mysql() {
        String x = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/java?useSSL=FALSE&serverTimezone=UTC";
            String user = "root";
            String password = "123";
            Connection cc = DriverManager.getConnection(url, user, password);
            Statement st = cc.createStatement();
            result = st.executeQuery("select * from study_tool");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}


