package com.yjyx.com.yjyx.jdbc;


import java.sql.ResultSet;

public class qaDb extends db_single{

    public ResultSet set;
    public String data;


    public static void select1() {
        db_single sin = new db_single();
        String sql1 = "select summary from yj_tasktrack where recipient_id=18574 and finished=1 and subjectid=1";
        sin.stm_find(sql1, "summary");

    }

    public static void select2() {
        db_single sin = new db_single();
        String sql1 = "select correctratio from yj_tasktrack where recipient_id=18853 and finished=1;";
        sin.stm_find(sql1, "correctratio ");


    }

    public static void select3() {
        db_single sin = new db_single();
        String sql1 = "";
        sin.stm_find(sql1, "correctratio ");
    }


    //查询数据
    public static void main(String[] args) {

        qaDb.select1();
        System.out.println("***********");
        // qaDb.select2();
    }





}
