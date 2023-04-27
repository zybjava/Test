package mysql;

import java.io.InputStream;
import java.sql.*;
import java.util.Scanner;

public class prepraedStatementDemo04 {
    public static String DBDRIVER="com.mysql.cj.jdbc.Driver";
    public static String DBURL="jdbc:mysql://localhost:3306/test";
    public static String DBUSER="root";
    public static String DBPASS="123456";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Class.forName(DBDRIVER);
        int id = 1;
        String sql = "select name,note from userclob where id=?";
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        rs = pstmt.executeQuery();//以下有两种方法，InputStream和Clob
//        if (rs.next()) {
//            String name = rs.getString(1);
//            StringBuffer note = new StringBuffer();
//            System.out.println("姓名：" + name);
//            InputStream in = rs.getAsciiStream(2);
//            Scanner sc = new Scanner(in);
//            sc.useDelimiter("\r\n");
//            while (sc.hasNext()) {
//                note.append(sc.next()).append("\n");
//            }
//            System.out.println("内容：" + note);
//            in.close();
//        }
        if(rs.next()){
            String name=rs.getString(1);
            Clob c=rs.getClob(2);
            String note=c.getSubString(1,(int)c.length());
            System.out.println("姓名："+name);
            System.out.println("内容："+note);
            System.out.println("分界线---------------------------------------------");
            c.truncate(100);
            System.out.println("部分内容为："+c.getSubString(1,(int)c.length()));
        }
        pstmt.close();
        conn.close();
    }
}
