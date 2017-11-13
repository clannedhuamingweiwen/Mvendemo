package com.yjyx.com.yjyx.jdbc;


import java.sql.*;

/**
 * 利用单例模式封装jdbc的基本逻辑
 * ：：增删改查
 */
public class db_single {

    private String driver = "com.mysql.jdbc.Driver";

    private static String url = "jdbc:mysql://118.178.129.156:3306/yjyx";

    final static String user = "dbadmin";

    final static String password = "yijiaoqaz";

    public static Connection conn;   //设置连接状态为null

    private Connection conn1;

    public String SqlData;

    public Statement stmt = null;

    public PreparedStatement pre = null;

    public CallableStatement cal = null;



    //使用单例模式配置数据库连接msg
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    //通过statement语句查询数据库
    public Statement stm_find(String sql, String a) {


        try {
            stmt=conn.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            //遍历结果集::依次取出元素
            while (rst.next()) {

                String d = rst.getString(1);
                System.out.println("got:" + d);

            }

            if (stmt == null) {
                System.out.println("afwe f ");

            } else {
                //   System.out.println("stmt is:" + stmt);
                return stmt;
                // System.out.println("<html>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stmt;

    }

    //创建存储过程声明
    public CallableStatement cal(String d1){

        try {
            CallableStatement cal =conn.prepareCall(d1);
            CallableStatement st =conn.prepareCall(d1);

            //System.out.println("-->"+st);
            if (cal==null){
                System.out.println("afwe f ");

            }else{
                System.out.println(stmt);
                return cal;

            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return cal;

    }


    public CallableStatement calclose(){

        if (cal!=null){
            try {
                cal.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return cal;

    }

    //关闭statement对象
    public Statement stmtclose(){

        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return stmt;

    }
    ////关闭Preparement对象
    public PreparedStatement preclose(){
        if (pre!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return pre;

    }



    //preparestatment语句查询数据库(可以防止sql注入的问题)
    public PreparedStatement pre_find(String sql,String data){


        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1,data);
            ResultSet rst = pre.executeQuery();
            System.out.println("-->"+rst);

            while (rst.next()) {
                int n = rst.getInt("id");
                //    System.out.println(n);
            }

            if (pre==null){
                System.out.println("afwe f ");

            }else{
                System.out.println(stmt);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pre;
    }



    //关闭数据库连接输出流
    public Connection destory() {
        if (conn != null) {

            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
//            System.out.println("yyyy7");

        }
        return conn;

    }



}





