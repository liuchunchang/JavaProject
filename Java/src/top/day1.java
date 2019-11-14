package top;

import java.sql.*;

public class day1 {
    public static void main(String[] args) {
        // write your code here
        Connection con = null;
        Statement sql ;
        ResultSet rs = null;
        //        连接名为ava的数据库
        String uri = "jdbc:mysql://localhost/java?useSSL=TRUE&serverTimezone=UTC";
        String user = "root";
        String password = "123";
        try {
//            加载JDBC-Mysql驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//             连接数据库
            con = DriverManager.getConnection(uri, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            sql = con.createStatement();
            //查询study_tool表
            rs=sql.executeQuery("select * from study_tool");
            while(rs.next()){
               String number=rs.getString(1);
               String name=rs.getString(2);
               String price=rs.getString(4);
                System.out.println(number);
                System.out.println(name);
                System.out.println(price);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
