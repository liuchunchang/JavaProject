package demo;

import java.sql.*;

public class Mysql_connect {
    public static void main(String[] args) {
//         write your code here

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("测试jdbc连接...");
            //msql 为数据库名称 其他的照写
            //user 为 mysql 数据库的用户名
            //password 为数据库连接密码
            // String url = "jdbc:mysql://localhost/java"
            String url = "jdbc:mysql://localhost/java?useSSL=FALSE&serverTimezone=UTC";
            String user = "root";
            String password = "123";
            //--建立数据库连接
            Connection cc = DriverManager.getConnection(url, user, password);
            System.out.println("测试数据库连接");
            //3--使用Connection 对象创建Statement，为传递sql语句做准备
            Statement st = cc.createStatement();
            ResultSet result = st.executeQuery("select * from study_tool");
            //while 循环获取数据库内容
            System.out.println("---------------------------");
            System.out.println("ID" + "\t" + "\t" + "文具名" + "\t" + "价格");
            while (result.next()) {
                System.out.println("---------------------------");
                String string1 = result.getString("item_id");
                String string2 = result.getString("cn_name");
                String string3 = result.getString("price");
                //打印表格;
                System.out.println(string1 + "\t" + string2 + "\t" + string3);
            }
            System.out.println("---------------------------");
            //关闭所有连接 必须从后面往前面关
            result.close();
            st.close();
            cc.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
