package zkc;
import java.sql.*;

public class Main {

    public static void main(String[] args)

    {

        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

        String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Test";

        String userName = "sa";

        String userPwd = "qwerty";

        Connection dbConn = null;

        try

        {

            Class.forName(driverName);

            dbConn = DriverManager.getConnection(dbURL, userName, userPwd);

            System.out.println("�������ݿ�ɹ�");
            Statement st=dbConn.createStatement();
            ResultSet re=st.executeQuery("select * from Table_1");
            while(re.next()) {
            	System.out.println("id��ֵΪ"+re.getString(1));
            	System.out.println("name��ֵΪ"+re.getString(2));
            }
           re.close();
           st.close();
           dbConn.close();
        }

        catch (Exception e)

        {

            e.printStackTrace();

            System.out.print("����ʧ��");

        }

    }

}