package cn;

import top.MySql;

import java.sql.*;
import java.util.LinkedList;

public class day7 {

    public static void main(String[] args) throws SQLException {
        // write your code here
        MySql mysql1 = new MySql();
        mysql1.mysql("root", "123");
        Statement statement = mysql1.con.createStatement();
        String sql="select * from study_tool";
        ResultSet rs = statement.executeQuery(sql);
        LinkedList<String> mylist=new LinkedList<>();
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                String name = rs.getString(3);
                String price = rs.getString(4);
               mylist.add(ID+"\t"+name+"\t"+price+"\t");
            }
            mysql1.con.close();
            for (String s : mylist) {
                System.out.println(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
