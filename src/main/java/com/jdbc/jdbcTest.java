package com.jdbc;

import java.lang.*;
import java.sql.*;


public class jdbcTest {
    String url = "jdbc:mysql://localhost:3306/sluice_db";    //获取协议、 IP  和端口等信息
    String user = "root";                                  //获取数据库用户名
    String password = "20020821";                     //取数据库用户密码

    public void addSluice(String id,String name,String buildTime,String master,String longitude,String latitude,String introduction){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,password);
            Statement statement = con.createStatement();
            String sql="insert into sluice_t values (?,?,?,?,?,?,?)";
            PreparedStatement prep=con.prepareStatement(sql);
            prep.setString(1,id);
            prep.setString(2,name);
            prep.setString(3,buildTime);
            prep.setString(4,master);
            prep.setString(5,longitude);
            prep.setString(6,latitude);
            prep.setString(7,introduction);
            prep.executeUpdate();
            prep.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public  void deleteSluice(String deleteSluiceId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement statement = con.createStatement();
            String sql = "delete from sluice_t where id=?";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setInt(1, Integer.parseInt(deleteSluiceId));
            prep.executeUpdate();
            prep.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public  void modifySluice(String id,String name,String buildTime,String master,String longitude,String latitude,String introduction){
        deleteSluice(id);
        addSluice(id,name,buildTime,master,longitude,latitude,introduction);
    }
}
