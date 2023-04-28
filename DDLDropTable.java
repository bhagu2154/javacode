package AdvancedJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDLDropTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://locahost:3303/cyber_success";
        String username="root";
        String password="root@1234";
        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement= connection.createStatement();
        String dropTable="DROP TABLE COURSE";
        boolean tableDeleted= statement.execute(dropTable);
        System.out.println("table is deleted "+tableDeleted);
        connection.close();
    }
}
