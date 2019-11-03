package zkc;
import java.sql.*;
public class TestJDBC {  
        private Connection con ;  
        private String user = "scott";  
        private String password ="tiger" ;  
        private String className = "oracle.jdbc.OracleDriver" ;  
        private String url = "jdbc:oracle:thin:@localhost:1522:orcl";  
  
        public static void main(String[] args) {  
               // TODO Auto-generated method stub  
              TestJDBC c = new TestJDBC();  
               c.ConnectOracle();  
               c.getCon();  
               c.closed();  
       }  
  
        public void ConnectOracle() {  
               try {  
                     Class. forName(className);  
                     System. out.println("加载数据库驱动成功！" );  
              } catch (ClassNotFoundException e ) {  
                     System. out.println("加载数据库驱动失败！" );  
                      e.printStackTrace();  
              }  
       }  
  
        /** 创建数据库连接 */  
        public Connection getCon() {  
               try {  
                      con =DriverManager.getConnection(url,user,password);  
                     System. out.println("创建数据库连接成功！" );  
              } catch (SQLException e ) {  
                     System. out.print(con );  
                     System. out.println("创建数据库连接失败！" );  
                      con = null;  
                      e.printStackTrace();  
              }  
               return con ;  
       }  
  
        public void closed() {  
               try {  
                      if (con != null) {  
                            con.close();  
                     }  
              } catch (SQLException e ) {  
                     System. out.println("关闭con对象失败！" );  
                      e.printStackTrace();  
              }  
       }  
  
}  