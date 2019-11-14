package top;

import java.sql.*;

public class MySql {
    public Connection con = null;

    public void mysql(String user, String password) {
        // write your code here
        //        连接名为ava的数据库

        String uri = "jdbc:mysql://localhost/java?useSSL=TRUE&serverTimezone=UTC";
        try {
//            加载JDBC-Mysql驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//             连接数据库
            con = DriverManager.getConnection(uri, user, password);
//            System.out.println("连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
