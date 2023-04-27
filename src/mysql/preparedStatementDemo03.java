package mysql;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class preparedStatementDemo03 {
    public static String DBDRIVER="com.mysql.cj.jdbc.Driver";
    public static String DBURL="jdbc:mysql://localhost:3306/test";
    public static String DBUSER="root";
    public static String DBPASS="123456";

    public static void main(String[] args) throws Exception{
        Connection conn=null;
        PreparedStatement pstmt=null;
        Class.forName(DBDRIVER);
        String name="张允斌";
        String sql="INSERT into userclob(name,note) values(?,?)";
        conn= DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        pstmt=conn.prepareStatement(sql);
        File f=new File("d:"+File.separator+"File"+File.separator+"zyb.txt");
        InputStream in=new FileInputStream(f);
        pstmt.setString(1,name);
        pstmt.setAsciiStream(2,in,(int)f.length());
        pstmt.executeUpdate();
        pstmt.close();
        conn.close();
    }
}
