package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class mysqlConnectionDemo01 {
    public static final String DBDRIVER="com.mysql.cj.jdbc.Driver";//驱动地址
    public static final String DBURL="jdbc:mysql://localhost:3306/test";//数据库地址
    public static final String DBUSER="root";//数据库名字
    public static final String DBPASS="123456";//数据库密码

    public static void main(String[] args) throws Exception{
        Connection conn=null;//驱动设置
        Statement stmt=null;//数据库设置
        String sql="INSERT into user(name,password,age,sex,birthday)"+"values('baba','baba123',48,'男','1975-01-06')";
        Class.forName(DBDRIVER);//实例化驱动，加载驱动程序
        conn= DriverManager.getConnection(DBURL,DBUSER,DBPASS);//连接数据库mysql
        stmt=conn.createStatement();//创建数据库
//        stmt.executeUpdate(sql);//操作数据库，增加插入语句
        int id=2;
        int age=20;
        String sql1="update user set age="+age+" where id="+id;//修改数据库，注意根据真实sql语句来编写字符串的，其中空格都是要注意的
        stmt.executeUpdate(sql1);//操作数据库修改语句
        stmt.close();//数据库关闭
        conn.close();//驱动关闭

    }
}
