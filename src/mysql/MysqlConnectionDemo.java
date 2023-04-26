package mysql;
import java.sql.*;
public class MysqlConnectionDemo {
    public static final String DBDRIVER="com.mysql.cj.jdbc.Driver";
    //public static final String DBURL="jdbc:mysql://localhost:3306/mysql";
    public static final String DBURL="jdbc:mysql://localhost:3306/mysql";
    public static final String DBUSER="root";
    public static final String DBPASS="123456";
    public static void main(String[] args) {
//       Connection conn=null;
//       Statement stmt=null;
//       try{
//           Class.forName("com.mysql.cj.jdbc.Driver");
//           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456");
//           stmt=conn.createStatement();
//           System.out.println("Connection to database!");
//       }catch (Exception e){
//           System.out.println("Error");
//           e.printStackTrace();
//       }finally {
//           try{
//               if(stmt!=null) stmt.close();
//               if(conn!=null) conn.close();
//           }catch (Exception e){
//               System.out.println("Failed");
//           }
//       }
        Connection conn=null;
        try{
            Class.forName(DBDRIVER);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(conn);
        try{
            conn.close();//数据库资源有限，因此最好操作完就关掉
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
