package mysql;

import java.sql.*;

public class prepraredStatementDemo02 {

    public static final String DBDRIVER="com.mysql.cj.jdbc.Driver";
    public static final String DBURL="jdbc:mysql://localhost:3306/test";
    public static final String DBUSER="root";
    public static final String DBPASS="123456";

    public static void main(String[] args) throws Exception{
        Connection conn=null;
        PreparedStatement st=null;
        ResultSet rs=null;
        String keyword="h";
        String sql="select * from user where name like ? or password like ? or sex like '女'";
        Class.forName(DBDRIVER);
        conn= DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        st=conn.prepareStatement(sql);
        st.setString(1,"%"+keyword+"%");
        st.setString(2,"%"+keyword+"%");
        //st.setString(3,"%"+keyword+"%");
        rs= st.executeQuery();
        while (rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            String password=rs.getString(3);
            int age=rs.getInt(4);
            String sex=rs.getString(5);
            java.util.Date d=rs.getDate(6);
            System.out.print("编号："+id+"、");
            System.out.print("姓名："+name+"、");
            System.out.print("密码："+password+"、");
            System.out.print("年龄："+age+"、");
            System.out.print("性别："+sex+"、");
            System.out.println("生日："+d);
            System.out.println("---------------------------------------");
        }
        rs.close();
        st.close();
        conn.close();
    }
}

