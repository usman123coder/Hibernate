package JDBCProjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExFirst {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hibdb","root","tiger");
        Statement stmt = con.createStatement();
        stmt.executeUpdate
                ("create table stu2(sid int,sName varchar(20),city varchar(20)," +
                        "primary key(sid))");
        con.close();
        stmt.close();
    }
}
