package cn;

import top.MySql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class day8 {
    public static void main(String[] args) throws SQLException {
        // write your code here
        MySql mysql1 = new MySql();
        mysql1.mysql("root", "123");
        String sql="insert into study_tool values (?,?,?,?,?)";
        PreparedStatement preSql=mysql1.con.prepareStatement(sql);
        preSql.setString(1,"0006");
        preSql.setString(2,"pen");
        preSql.setString(3,"钢笔");
        preSql.setString(4,"1.8");
        preSql.setString(5,null);
        preSql.executeUpdate();
        String sql1="select * from study_tool";
        Statement statement = mysql1.con.createStatement();
        ResultSet rs = statement.executeQuery(sql1);
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
