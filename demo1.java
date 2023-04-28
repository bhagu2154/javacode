package AdvancedJDBC;

import java.sql.*;

public class demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //load and register the Driver with DriverManger
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Get connection
        String url="jdbc:mysql://localhost:3306/cyber_success";
        String userName="root";
        String password="root@1234";
       Connection connection = DriverManager.getConnection(url,userName,password);
       //Execute the Query
        Statement statement=connection.createStatement();
        String createQuery="CREATE TABLE student(id int(4),student_Name varchar(200),student_phone int (45))";
       boolean isTableCreated= statement.execute(createQuery);
        System.out.println("table is created successfully "+isTableCreated);

        //close the connection
        connection.close();
    }

}
