package JDBCProjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExInsert {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hibdb","root","tiger");
        PreparedStatement ptstmt = con.prepareStatement(
                "insert into stu2 values(?,?,?)"
        );
        ptstmt.setInt(1,102);
        ptstmt.setString(2,"Salman");
        ptstmt.setString(3,"Bhopal");
        ptstmt.executeUpdate();
        ptstmt.close();
        con.close();


    }
}
