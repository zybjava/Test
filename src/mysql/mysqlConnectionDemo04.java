package mysql;

import java.sql.*;
public class mysqlConnectionDemo04 {
    public static final String DBDRIVER="com.mysql.cj.jdbc.Driver";
    public static final String DBURL="jdbc:mysql://localhost:3306/test";
    public static final String DBUSER="root";
    public static final String DBPASS="123456";

    public static void main(String[] args) throws Exception{
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String sql="select * from user";
        Class.forName(DBDRIVER);
        conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        stmt=conn.createStatement();
        rs=stmt.executeQuery(sql);
        while (rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            String pass=rs.getString(3);
            int age=rs.getInt(4);
            String sex=rs.getString(5);
            java.util.Date d=rs.getDate(6);
            System.out.print("编号："+id+"、");
            System.out.print("姓名："+name+"、");
            System.out.print("密码："+pass+"、");
            System.out.print("年龄："+age+"、");
            System.out.print("性别："+sex+"、");
            System.out.println("生日："+d+"、");
            System.out.println("------------------------------------------------");
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}
