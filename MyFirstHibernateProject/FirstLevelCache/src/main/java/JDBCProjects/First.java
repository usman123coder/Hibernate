package JDBCProjects;

import org.hibernate.annotations.processing.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class First {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sid : ");
        int sid = Integer.parseInt(sc.nextLine());
        System.out.println("Enter sName : ");
        String sName = sc.nextLine();
        System.out.println("Enter marks : ");
        int marks = Integer.parseInt(sc.nextLine());
        Connection con = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/hibdb","root","tiger");
        PreparedStatement pstmt = con.prepareStatement("insert into stu1 values(?,?,?)");
        pstmt.setInt(1,sid);
        pstmt.setString(2,sName);
        pstmt.setInt(3,marks);
        pstmt.executeUpdate();
        con.close();sc.close();pstmt.close();

    }
}
