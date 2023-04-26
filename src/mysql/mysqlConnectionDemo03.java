package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class mysqlConnectionDemo03 {

    public static final String DBDRIVER="com.mysql.cj.jdbc.Driver";
    public static final String DBURL="jdbc:mysql://localhost:3306/test";
    public static final String DBUSER="root";
    public static final String DBPASS="123456";

    public static void main(String[] args) throws Exception{
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        //String sql="select id,name,password,age,sex,birthday from user";
        String sql="select * from user";//在java中select可以使用*，就是不知道各列元素是什么,对于开发1来将不好找
        Class.forName(DBDRIVER);
        conn= DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        stmt=conn.createStatement();
        rs=stmt.executeQuery(sql);
        while (rs.next()){
            //int id=rs.getInt("id");
            String id=rs.getString("id");//getString()是通用的，所有数据都可以通过getString()获得
            String name=rs.getString("name");
            String password=rs.getString("password");
            int age=rs.getInt("age");
            String sex=rs.getString("sex");
            //String birthday=rs.getString("birthday");
            Date d=rs.getDate("birthday");
            System.out.print("编号："+id+"\t");
            System.out.print("姓名："+name+"\t");
            System.out.print("密码："+password+"\t");
            System.out.print("年龄："+age+"\t");
            System.out.print("性别："+sex+"\t");
            System.out.println("生日："+d);
            System.out.println("------------------------------");
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}
