package AdvancedJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DML {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/cyber_success";
        String  username="root";
        String password="root@1234";
        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        String insertQuery="INSERT INTO student" + "(id,student_Name, student_phone) " + "values(1,'Nagesh','87689769')";
        int executeQuery= statement.executeUpdate(insertQuery);
        System.out.println("Data inserted successfully "+executeQuery);
        connection.close();
    }
}
