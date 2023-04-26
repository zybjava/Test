package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class preparedStatementDemo01 {
    public static final String DBDRIVER="com.mysql.cj.jdbc.Driver";
    public static final String DBURL="jdbc:mysql://localhost:3306/test";
    public static final String DBUSER="root";
    public static final String DBPASS="123456";

    public static void main(String[] args) throws Exception{
        Connection conn=null;
        PreparedStatement pstmt=null;
        String name="huihui";
        String passsword="beautiful";
        int age=20;
        String sex="女";
        String birthday="2002-06-14";
        java.util.Date temp=null;
        temp=new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
        java.sql.Date bir=new java.sql.Date(temp.getTime());
        String sql="insert into user(name,password,age,sex,birthday)"+"values(?,?,?,?,?)";
        Class.forName(DBDRIVER);
        conn= DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,name);
        pstmt.setString(2,passsword);
        pstmt.setInt(3,age);
        pstmt.setString(4,sex);
        pstmt.setDate(5,bir);
        pstmt.executeUpdate();
        pstmt.close();
        conn.close();

    }
}
