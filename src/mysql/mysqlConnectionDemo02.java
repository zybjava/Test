package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class mysqlConnectionDemo02 {

    public static final String DBDRIVER="com.mysql.cj.jdbc.Driver";
    public static final String DBURL="jdbc:mysql://localhost:3306/test";
    public static final String DBUSER="root";
    public static final String DBPASS="123456";

    public static void main(String[] args) throws Exception{
        Connection conn=null;//驱动
        Statement stmt=null;//数据库
        int id=5;
        String sql="delete from user where id="+id;//删除语句
        Class.forName(DBDRIVER);//加载驱动程序
        conn= DriverManager.getConnection(DBURL,DBUSER,DBPASS);//连接数据库
        stmt=conn.createStatement();//创建数据库
        stmt.executeUpdate(sql);//操作数据库,删除操作
        stmt.close();//关闭数据库
        conn.close();//关闭驱动
    }
}
