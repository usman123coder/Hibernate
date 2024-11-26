package JDBCProjects;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Second {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/hibdb","root","tiger");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from stu1");
        while (rs.next())
            System.out.println(rs.getInt(1)+"\t" +
                    rs.getString(2)+"\t"+rs.getInt(3));
    }
}
